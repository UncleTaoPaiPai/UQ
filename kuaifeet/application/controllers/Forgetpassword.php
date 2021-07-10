<?php

    class forgetpassword extends CI_Controller{

        /**
        *  In Milestone 2
        *  Constructor, which extends from the CI_Model class
        *  load the module of model (forgetpassword_model) --- data from database
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->model('forgetpassword_model');
            
        }

        /**
        *  In Milestone 2 
        *  load the module of view (forgetpassword) --- HTML 
        */
        public function index(){
            $this->load->view('forgetpassword');
        }
       
        /**
        *  In Milestone 2 
        *  The front-end user passes the value of "username" 
        *  and finds the corresponding "safe_question" 
        *  in the database using "getsafe_question" 
        *  in the model module "forgetpassword_model".
        *  and then transferring data to the module of view (question) -- HTML
        */
        public function getsafe_question(){

            $username = $this->input->post("username");
            $question = $this->forgetpassword_model->getsafe_question($username);
            $data['safe_question'] = $question;
            $this->load->vars($data);
            $this->load->view('question');
            
        }

        /**
        *  In Milestone 2 
        *  The front-end user passes the values of "username" and "answer",
        *  and uses "getsafe_answer" in the Model module "forgetpassword_model" 
        *  to find the corresponding values in the database. 
        *  Load the module of view (RestartSetPassword) -- HTML;
        *  Otherwise, load the module of view (forgetpassword) -- HTML
        */
        public function getsafe_answer(){
            $username = $this->input->post("username");
            $answeruser = $this->input->post("answer");
            $answerdata = $this->forgetpassword_model->getsafe_answer($username);
            
            foreach($answerdata as $item) {
                if($item->question_answer == $answeruser) {
                    $this->load->view("restartsetpassword");
                }else{
                    $this->load->view("forgetpassword");
                }
            }
            
        }

    }