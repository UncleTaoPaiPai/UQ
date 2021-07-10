<?php

    class deletemodel extends CI_Model{

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
        * delete video
        *
        * @param: string $video video's username 
        * @return：bool Determine whether to delete the video 
        */
        public function deletevideo($videoname){
            
            $bool = $this->db->delete('products',array('video_name'=>$videoname));
            return $bool;
        }

    }