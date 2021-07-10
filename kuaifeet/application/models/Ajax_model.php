<?php

    class ajax_model extends CI_Model{


        /**
        *  In Milestone 2
        *  Constructor, which extends from the CI_Model class
        *  load the database configuration
        */
        public function __construct()
        {   
            parent::__construct();
            $this->load->database();
        }   

        /**
        *
        * In Milestone 2 
        * get the user's safe_question
        *
        * @param: string $query The key word 
        * @return：array the use's products information  
        */
        function fetch_data($query){
            $this->db->select("*");
            $this->db->from("products");
         if($query != ''){
            $this->db->like('video_name', $query);
            $this->db->or_like('name', $query);
         }
         $this->db->order_by('name', 'DESC');
         return $this->db->get();
        }

    }