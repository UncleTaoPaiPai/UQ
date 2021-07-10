<?php 

    class rating extends CI_Controller{

        
        public function __construct(){
            parent::__construct();
            $this->load->model('User_model');
        }

        public function getrating(){
            $rating = $this->input->post('rating');
            $username = $_SESSION['username'];
            $rel=$this->User_model->save($username,$rating);
            if($rel == TRUE){
                $this->load->view('template/header');
                $this->load->view('update_sucess');
            }
        
        }

    } 