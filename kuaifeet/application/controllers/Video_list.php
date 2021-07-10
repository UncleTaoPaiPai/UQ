<?php

    class video_list extends CI_Controller{

        /**
        *  In Milestone 2 
        *  Constructor, which extends from the CI_Model class
        *  load the module of model (video_model)
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->model("video_model");
        }

        /**
        *  In Milestone 2
        *  Get the data in the SelectVideoFrontFour method of the "Video_Model" model module
        *  Load the module of view (video_info)
        */
        public function find_fontfourvideo(){
            $finished = $this->video_model->selectvideofrontfour();
            $data['video'] = $finished;
            $this->load->vars($data);
            $this->load->view('template/header');
            $this->load->view('video_info');

        }

    }