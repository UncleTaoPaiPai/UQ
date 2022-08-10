<?php
    class face extends CI_Controller{

        /**
        *  In Milestone 3
        *  Constructor, which extends from the CI_Model class
        *  load the module of model (registrationmodel) --- data from database
        *  load the module of library (facebook)
        */
        public function __construct(){

            parent::__construct();
            $this->load->library('facebook');
            $this->load->model("registrationmodel");
       
        }

        /**
        *  In Milestone 3 
        *  load the module of view (facebook) --- HTML 
        */
        public function index(){
               $this->load->view('facebook');
        }

         /**
        *  In Milestone 3 
        *  When a user logs into Facebook
        *  All kinds of information about the user is passed into the database 
        */
        public function login(){

            $user = array(); 
            if($this->facebook->is_authenticated()){ 
                $fb = $this->facebook->request('get', '/me?fields=id,first_name,last_name,email,link,gender,picture'); 
                $user['oauth_provider'] = 'facebook'; 
                $user['oauth_uid']    = !empty($fb['id'])?$fb['id']:'';; 
                $user['first_name']    = !empty($fb['first_name'])?$fb['first_name']:''; 
                $user['last_name']    = !empty($fb['last_name'])?$fb['last_name']:''; 
                $user['email']        = !empty($fb['email'])?$fb['email']:''; 
                $user['gender']        = !empty($fb['gender'])?$fb['gender']:''; 
                $user['picture']    = !empty($fb['picture']['data']['url'])?$fb['picture']['data']['url']:''; 
                $user['link']        = !empty($fb['link'])?$fb['link']:'https://www.facebook.com/'; 

                $username= $user['first_name'];
                $name= $user['last_name'];
                $email= $user['email'];
                $vcode = rand(1000000, 9999999); 
                $password = "";
                $safe_question="";
                $question_answer="";
                $finished = $this->registrationmodel->go_register($username,$password,$email,$safe_question,$question_answer,$name,$vcode);
                if(!empty($username)){ 
                    $user_data=array(
                        'username' => $username,
                        'logged_in'=>true,
                    );
                    $this->session->set_userdata($user_data);   
                }
                $this->load->view('home'); 
            }else{ 
                $data['title'] = 'Login - IPL Quiz';
                $this->load->view('facebook', $data);
            } 

        }

    }