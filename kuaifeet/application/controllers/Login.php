<?php

    class login extends CI_Controller {

        /**
        *  In Milestone 2 
        *  Constructor, which extends from the CI_Model class
        *  load the module of library (encryption) and (session)
        *  load the module of helper (cookie),(form),(url)
        *  load the module of model (user_model)
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->library('encryption');
            $this->load->helper('cookie');
            $this->load->library('session');
            $this->load->helper('form');
            $this->load->helper('url');
            $this->load->model('user_model');

        }

        /**
        *  In Milestone 2
        *  the function of logout
        *  delete the session and cookie
        *  load the module of view (home) --- HTML 
        */
        public function logout(){

            $this->session->unset_userdata('logged_in');
            $this->session->unset_userdata('username');
            delete_cookie('logged_in');
            $this->load->view('home');
            
        }

        /**
        *  In Milestone 2
        *  Check if there is a session,
        *  if so load the module of view (home) -- -- HTML;
        *  If the user is not checked again at the time of login.
        *  Have you clicked the "Remember Me" button? If yes, 
        *  the account and password entered by the user will be verified by the database.
        *  If the value is "TRUE", 
        *  the data is stored in the session and the module of view (home) is loaded -- HTML;
        *  Load the module of view (login) -- HTML;
        *  if the user does not click the "Remember Me" button;
        */
        public function index() {

            if(!$this->session->userdata('logged_in')) {
                if(get_cookie('remember')) {
                    $username = get_cookie('username');
                    $password = get_cookie('password'); 
                    $data['username'] = get_cookie('username');
                    if($this->user_model->login($username, $password)) {
                        $user_data=array(
                            'username' => $username,
                            'logged_in' => TRUE,
                        );
                        $this->session->set_userdata($user_data);
                        $this->load->view('home');
                    }
                }else{
                    $this->load->view('login');
                }
            }else{
                $this->load->view('home');
            }

        }

        /**
        *  In Milestone 2
        *  You get "username" and "passoword" 
        *  and you check to see if the user hits "remember me."
        *  Load the module of view (home) -- HTML if session exists
        *  If the session does not exist, 
        *  "username" and "password" will be used to check the database    
        *  If the value "FALSE" loads the module of view (login) -- HTML 
        *  and passes in the cookie data as well
        *  If the value "TRUE" sets the data to session
        *  If the user clicks "Remember Me" the cookie value and time will be set
        *  And Load the module of view (home) -- HTML
        */
        public function check_login(){

            $data['username'] = get_cookie('username');
            $username = $this->input->post('username');
            $password = $this->input->post('password');
            $remember = $this->input->post('remember');

            if(!$this->session->userdata('logged_in')) {
                if($this->user_model->login($username, $password)) {
                    $user_data=array(
                        'username' => $this->input->post('username'),
                        'logged_in'=>true,
                    );
                    if($remember){
                        set_cookie("username",$username,'300000');
                        set_cookie("password",$password,'300000');
                        set_cookie("remember",$remember,'300000');
                    }
                    $this->session->set_userdata($user_data);
                    $this->load->view('home');
                }else{
                    $this->load->view('login',$data);
                }
            }else{
                $this->load->view('home');
            }

        }

    }