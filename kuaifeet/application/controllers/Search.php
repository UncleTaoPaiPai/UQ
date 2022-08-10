<?php

    class search extends CI_Controller{

        /**
        *  In Milestone 2 
        *  Constructor, which extends from the CI_Model class
        *  load the module of helper (url_helper)
        *  load the module of model (ajax_model)
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->model('ajax_model');
            $this->load->helper('url_helper');
        }

        /**
        *  In Milestone 2 
        *  load the module of view (ajax) --- HTML 
        */
        public function showajax(){
            $this->load->view('template/header');
            $this->load->view('ajax');
        }

        /**
        *  In Milestone 2
        *  load the module of view (ajax) --- HTML 
        */
        public function index() {
            $this->load->view('template/header');
            $this->load->view('ajax');
        }

        /**
        *  In Milestone 2 
        *  Pass the keyword from the front end into the "ajax_model"
        *  method of the model module's "fetch_data" method
        *  If the value is greater than 0, the data is passed to the front-end JS
        *  Otherwise, it will print "No Data Found".
        */
        public function fetch(){
            $output = '';
            $query = '';
            if($this->input->post('query')){
                $query = $this->input->post('query');
            }
            $data = $this->ajax_model->fetch_data($query);
                if($data->num_rows() > 0){
                    echo json_encode ($data->result());
                }else{
                    $output .= 'No Data Found';
                }
            echo $output;
           }

    }