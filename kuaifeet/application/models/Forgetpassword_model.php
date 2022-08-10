<?php

    class forgetpassword_model extends CI_Model{
         
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
        * get the user's safe_question
        *
        * @param: string $username user's username 
        * @return：array the use's safe_question  
        */
        public function getsafe_question($username){

            $sql = "select safe_question from users where username = ?";
            $rel = $this->db->query($sql,$username);
            return $rel->result_array();

        }

        /**
        * In Milestone 2 
        * get the user's safe_answer 
        *
        * @param: string $username user's username 
        * @return：array the use's safe_answer  
        */
        public function getsafe_answer($username){

            $sql = "select question_answer from users where username = ?";
            $rel = $this->db->query($sql,$username);
            return $rel->result();

        }

    }