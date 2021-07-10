<?php

    class videoupdate extends CI_Controller{

        /**
        *  In Milestone 2 
        *  Constructor, which extends from the CI_Model class
        *  load the module of model (videoupdate_model)
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->model('videoupdate_model');
        }

        /**
        *  In Milestone 2 
        *  load the module of view (videoupdate) --- HTML 
        */
        public function index(){
            $this->load->view('template/header');
            $this->load->view('videoupdate');
        }

        /**
        *  In Milestone 2 
        *  Upload video It then receives the front-end data 
        *  and passes it into the "videoupdate_model" method of 
        *  the model module's "go_insertVideo" method
        *  If the value "TRUE" loads the module of view (update_sucess) -- HTML
        */
        public function updatevideo(){
            
            $config['upload_path']= './assets/videoes/';
            $config['allowed_types'] = 'mp4';
            $config['max_size'] = 10000000;
            $this->load->library('upload',$config);
            $this->upload->do_upload('video');
            $data = $this->upload->data();
            $video=$data['file_name'];
            $language = $this->input->post('language');
            $video_name = $this->input->post('video_name');
            $name = $this->input->post('name');
            $finished = $this->videoupdate_model->go_insertvideo($name,$video_name,$video,$language);
            if($finished == TRUE){
                $this->load->view('template/header');
                $this->load->view('update_sucess');
            }else{
                $this->index();
            }
            
        }

        /**
        *  In Milestone 2 
        *  Get the data in the selectallVideo 
        *  method of the "video_model" model module 
        *  Finally, load the module of view (video_info) -- HTML
        */
        public function allvideo(){

            $rel=$this->video_model->selectallvideo();
            $data['video'] = $rel;
            $this->load->vars($data);
            $this->load->view('template/header');
            $this->load->view('video_info');
        }

    }