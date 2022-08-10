<?php

    class users_image extends CI_Model{

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
        * Update photos
        *
        * @param: string $image image's name
        * @return：bool determine if the update successful
        */
        public function go_updateimage($image){
            $username = $_SESSION['username'];
            $data=array(
                'user_image' => $image,
            );
            $bool = $this->db->update('users_images',$data,array('username'=>$username));
            return $bool;
        }

    }