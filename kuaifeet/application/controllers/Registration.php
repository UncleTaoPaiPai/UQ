<?php

    class registration extends CI_Controller{

        /**
        *  In Milestone 2 
        *  Constructor, which extends from the CI_Model class
        *  load the module of library (encryption)
        *  load the module of model (registrationmodel)
        */
        public function __construct(){
            parent::__construct();
            $this->load->library('encryption');
            $this->load->model("registrationmodel");
        }

        /**
        *  In Milestone 2 
        *  load the module of view (register) --- HTML 
        */
        public function index(){
            $this->load->view('register');
        }

        /** 
        *  In Milestone 2
        *  get password and username from the front page
        *  Put it in the RestartPassword Function of 
        *  the RegistrationModel Model module 
        *  Reset the password if the result is "TRUE"
        *  Load the module of view (update_sucess) -- HTML
        */
        public function resetpassword(){
            $password = $this->input->post('password');
            $username = $this->input->post('username');
            $newpwd = md5(md5(md5(md5(md5(md5(md5($password)))))));
            $finished = $this->registrationmodel->restartpassword($username,$newpwd);
            if($finished == TRUE){
                $this->load->view('template/header');
                $this->load->view('update_sucess');
            }
        }

        /**
        *  In Milestone 2 
        *  Set mandatory items
        *  Put the data from the front end into the "go_register" 
        *  method of the "registrationModel" model module for judgment
        *  If TRUE, Load the module of view (register_sucess) -- HTML
        */
        public function start_reg(){

            $captcha_response = trim($this->input->post('g-recaptcha-response'));
            if($captcha_response != ''){
                
                $keysecret = '6LdBQMEaAAAAAKh-nFTXdCyv432lEvWNPiG4kUQt';

                $check = array(
                    'secret' => $keysecret,
                    'response' => $this->input->post('g-recaptcha-response')
                );

                $startprocess = curl_init();
                curl_setopt($startprocess, CURLOPT_URL, "https://www.google.com/recaptcha/api/siteverify");
                curl_setopt($startprocess, CURLOPT_POST, true);
                curl_setopt($startprocess, CURLOPT_POSTFIELDS, http_build_query($check));
                curl_setopt($startprocess, CURLOPT_SSL_VERIFYPEER, false);
                curl_setopt($startprocess, CURLOPT_RETURNTRANSFER, true);
                $receivedata = curl_exec($startprocess);
                $finalresponse = json_decode($receivedata, true);
                if($finalresponse['success']){
                    $this->load->helper(array('form', 'url'));
                    $this->load->library('form_validation');
                    $this->form_validation->set_rules('name', 'Name', 'required');
                    $this->form_validation->set_rules('username', 'username', 'is_unique[users.username]|required');
                    $this->form_validation->set_rules('password', 'password', 'required|min_length[3]');
                    $this->form_validation->set_rules('email', 'email', 'required');
                    $this->form_validation->set_rules('safe_question', 'safe_question', 'required');
                    $this->form_validation->set_rules('question_answer', 'question_answer', 'required');
                    $this->form_validation->set_rules('confirm_password', 'Confirm_password', 'required|matches[password]');
                    if($this->form_validation->run() == TRUE) {
                        $name = $this->input->post('name');
                        $username = $this->input->post('username');
                        $email = $this->input->post('email');
                        $password = $this->input->post('password');
                        $safe_question = $this->input->post('safe_question');
                        $question_answer = $this->input->post('question_answer');
                        $vcode = rand(1000000, 9999999);
                        $finished = $this->registrationmodel->go_register($username,$password,$email,$safe_question,$question_answer,$name,$vcode);
                        if($finished == TRUE) {
                            $this->load->view('template/header');
                            $this->load->view('register_sucess');
                        }
                    }else{
                        $this->index();
                    }

                }else {
                    $this->index();
                }
 
            }else{
                $this->index();
            }

            



        }

    }