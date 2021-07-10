<?php

    class userupdate_model extends CI_Model{

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
        *  In Milestone 2 
        * 
        * Upload user information
        *
        * @param: string $username user's username
        * @param: string $name user's name
        * @param: string $gender user's gender
        * @param: int $age user's age
        * @param: string $nationlity user's nationality
        * @param: string $image user image's name
        * @param: string $ps user's personal statement
        * @return：bool determine if the upload successful
        */
        public function go_updateinfo($username,$name,$gender,$age,$nationality,$image,$ps){
            
            $data=array(
                'username'=>$username,
                'name' => $name,
                'gender' =>$gender,
                'age' =>$age,
                'nationality' => $nationality,
                'image' => $image,
                'ps' => $ps,
            );

            $bool = $this->db->insert('users_info',$data);
            return $bool;
        }

    }