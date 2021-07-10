<?php

    class videoupdate_model extends CI_Model{

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
        * Upload video
        *
        * @param: string $name user's name
        * @param: string $video_name video's name
        * @param: string $video albums'video
        * @param: string $language albums'video language
        * @return：bool determine if upload video successful
        */
        public function go_insertvideo($name,$video_name,$video,$language){
            $data=array(
                'name' => $name,
                'video_name' => $video_name,
                'video' =>$video,
                'language' => $language,
            );

            $bool = $this->db->insert('products',$data);
            return $bool;
        }

    }