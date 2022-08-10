<?php

    class user_model extends CI_Model{

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
        * Determine if the user exists
        *
        * @param: string $username user's username
        * @param: string $password user's passowrd 
        * @return：bool determine if the user exists 
        */
        public function login($username, $password) {
            
            $sql = "select password from users where username = ?";
            $bool = $this->db->query($sql,$username);
            $newpass = md5(md5(md5(md5(md5(md5(md5($password)))))));
            if($bool != NULL){
                foreach($bool->result() as $row){
                    $hash=$row->password;
                    if($newpass == $hash){       
                        return TRUE;
                    }else {   
                        return FALSE;
                    }
                }
            }else {
                return FALSE;
            }

        }

        /**
        * In Milestone 3 
        * Add rating
        *
        * @param: string $username user's username
        * @param: string $rating rating 
        * @return：bool determine if rating add sucessfully 
        */
        public function save($username,$rating){
            $this->load->database();
            $data=array(
                'username'=>$username,
                'rating'=>$rating,
            );
            $bool = $this->db->insert('rating',$data);
            return $bool;

        }

    }