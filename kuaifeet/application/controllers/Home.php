<?php

    class home extends CI_Controller{

        /**
        *  In Milestone 2 
        *  Constructor, which extends from the CI_Model class
        */
        public function __construct()
        {
            parent::__construct();
           
        }

        /**
        *  In Milestone 2 
        *  load the module of view (home) --- HTML 
        */
        public function index(){
           
            $this->load->view('home');
            
        }

    }