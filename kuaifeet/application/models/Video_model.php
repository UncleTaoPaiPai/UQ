<?php

    class video_model extends CI_Model{

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
        * Add comments
        *
        * @param: string $video_name video's name
        * @param: string $comments video's comments
        * @param: string $name user's name
        * @return：bool determine if comment successful
        */
        public function insertcomment($video_name,$comments,$name){
            $data=array(
                'video_name' =>$video_name,
                'comments' =>$comments,
                'name'=>$name,
            );

            $finished = $this->db->insert('comments',$data);
            return $finished;
        }

        /**
        *  In Milestone 2 
        * Show all comments
        *
        * @param: string $name user's name
        * @return：array all comments
        */
        public function showcomments($name){
            $videoname=$name."%";
            $sql = "select video_name, comments, name from comments where  comments.video_name like ?";
            $rel=$this->db->query($sql,$videoname);
            return $rel->result_array();
        }

        /**
        *  In Milestone 2 
        * 
        * Show video
        *
        * @return：array videoes
        */
        public function selectvideofrontfourmore(){

            $sql = "select * from products where id > 4";
            $rel=$this->db->query($sql);
            return $rel->result_array();

        }

        /**
        *  In Milestone 2 
        * 
        * Show video
        *
        * @return：array videoes
        */
        public function selectvideofrontfour(){

            $sql = "select * from products where id <=4";
            $rel=$this->db->query($sql);
            return $rel->result_array();

        }

        /**
        *  In Milestone 2 
        * Show video
        *
        * @return：array videoes
        */
        public function selectallvideo(){

            $sql = "select video from products";
            $rel=$this->db->query($sql);
            return $rel->result_array();
        }

        /**
        * In Milestone 2 
        * Show video
        *
        * @param: string $video_name video's name
        * @return：array video
        */
        public function selectvideo($video_name){

            $this->db->select("*");
            $this->db->from("products");
            if($video_name != ''){
                $this->db->like('video_name', $video_name,'after');
            }
            $rel = $this->db->get();
            return $rel->result_array();

        }
    }