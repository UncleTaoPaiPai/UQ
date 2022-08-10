<?php

    class delete extends CI_Controller{
        
        /**
        *  In Milestone 2
        *  Constructor, which extends from the CI_Model class
        *  load the module of model (deletemodel)
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->model("deletemodel");
        }

        /**
        *  In Milestone 2
        *  load the module of view (delete) --- HTML 
        */
        public function index(){

            $this->load->view('template/header');
            $this->load->view('delete');
        }

        /**
        *  In Milestone 2
        *  Delete specified video
        */
        public function deletevideo(){
            $videoname = $this->input->post('video_name');
            $finished = $this->deletemodel->deletevideo($videoname);
            if($finished == TRUE) {
                $this->load->view('template/header');
                $this->load->view('update_sucess');
            }
        }

    }