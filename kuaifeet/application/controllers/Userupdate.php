<?php

    class userupdate extends CI_Controller{

        /**
        *  In Milestone 2 
        *  Constructor, which extends from the CI_Model class
        *  load the module of library (session)
        *  load the module of model (userupdate_model)
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->model('userupdate_model');
            $this->load->model('User_model');
            $this->load->model('status');
            $this->load->library('session');

        }

        /**
        *  In Milestone 3
        *  Upload the rating and receive the front-end data
        *  Pass it to the GO_UPDATEINFO method 
        *  from the "user_model" model module
        *  If TRUE, load the module of view (update_sucess) -- HTML 
        */
        public function getrating(){
            $rating = $this->input->post('rating');
            $username = $_SESSION['username'];
            $rel=$this->User_model->save($username,$rating);
            if($rel == TRUE){
                $this->load->view('template/header');
                $this->load->view('update_sucess');
            }
        
        }

        /**
        *  In Milestone 2 
        *  load the module of view (userupdate) --- HTML 
        */
        public function index() {
            
            $this->load->view('template/header');
            $this->load->view('userupdate');

        }

        /**
        *  In Milestone 2
        *  Upload the image and receive the front-end data
        *  Pass it to the GO_UPDATEINFO method 
        *  from the "USBOUND DATE_MODEL" model module
        *  If TRUE, load the module of view (update_sucess) -- HTML 
        */
        public function start_update(){
            
            $config['upload_path']='./assets/picture/';
            $config['allowed_types'] = 'mp4|jpg|png';
            $config['max_size'] = 10000000;
            $config['width'] = 350;
            $config['height'] = 520;
            $this->load->library('upload',$config);
            $this->upload->do_upload('pic');
            if($this->upload->do_upload('pic')){
            
                $data = array('upload_data' => $this->upload->data()); 
                $this->resize($data['upload_data']['full_path'],$data['upload_data']['file_name']);
            
            }

            $data = $this->upload->data();
            $image = $data['file_name'];
            $username = $_SESSION['username'];
            
            $nationality = $this->input->post('nationality');
            $name = $this->input->post('name');
            $age = $this->input->post('age');
            $gender = $this->input->post('gender');
            $ps = $this->input->post('ps');
            $finished = $this->userupdate_model->go_updateinfo($username,$name,$gender,$age,$nationality,$image,$ps);
            if($finished == TRUE) {
                $this->load->view('template/header');
                $this->load->view('update_sucess');
            }else{
                $this->index();
            }
        
        }

        

    }