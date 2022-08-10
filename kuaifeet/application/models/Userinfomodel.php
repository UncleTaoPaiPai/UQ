<?php

    class userinfomodel extends CI_Model{

        /**
        *  In Milestone 2 
        * 
        *  Constructor, which extends from the CI_Model class
        *  load the database configuration
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->database();
            
        }

        /**
        * In Milestone 2 
        * All of the user's information
        *
        * @return：array all of the user's information
        */
        public function getinfo(){
            $username= $_SESSION['username'];   
            // $email= $_SESSION['email'];
            // echo $email;
            $sql = "select * from `users_info` where username = ?";
            $rel = $this->db->query($sql,$username);
            return $rel->result_array();
        }

    }