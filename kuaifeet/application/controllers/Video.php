<?php

    class video extends CI_Controller{

        /**
        *  In Milestone 2 
        *  Constructor, which extends from the CI_Model class
        *  load the module of model (video_model)
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->model("video_model");
        }

        /**
        *  In Milestone 2
        *  It then receives data from the front end
        *  Pass it into the "video_model" model module's "insertComment" method
        *  If TRUE, load the module of view (update_sucess) -- HTML
        */
        public function addcomments(){
            
            $ipaddress =  $_SERVER['REMOTE_ADDR'];
            if(isset($_SESSION['username']) == TRUE) {
                 $name = $_SESSION['username'];
            }else {
                $name = "Anonymous".'('.$ipaddress.')';
            }
            $video_name = $this->input->post('video_name');
            $comments=$this->input->post('comments');
            $finished = $this->video_model->insertcomment($video_name,$comments,$name);
            if($finished == TRUE){
                $this->load->view('template/header');
                $this->load->view('update_sucess');
            }

        }

        /**
        *  In Milestone 2 
        *  Get data from the "Video_Model" model module's selectVideoFrontFour method
        *  and the "Video_Model" model module's selectVideoFrontFourmore method
        *  Load the module of view (user) -- HTML
        */
        public function find_videolist(){
            $url = 'http://'.$_SERVER['HTTP_HOST'].$_SERVER['REQUEST_URI'];
            $parts=explode("/",$url);
            $finalURI=end($parts);
            $result="";
            if(strpos($finalURI,'.') == TRUE){
                $result = substr($finalURI,0,strrpos($finalURI ,"."));
            }else{
                $result = $finalURI;
            }
            $videolist = $this->video_model->selectvideofrontfour();
            $videolistmore = $this->video_model->selectvideofrontfourmore();
            $data['listvideo'] = $videolist;
            $data['listdataa'] = $videolistmore;
            $this->load->vars($data);
            $this->load->view('template/header');
            $this->load->view('user');

        }

        /**
        *  In Milestone 2 
        *  Cut the data from the URL and put it 
        *  in the selectVideo method of the "video_model" model module
        *  And in the showComments method of the "video_model" model module
        *  Then get the data in the "video_model" model module's selectVideoFrontFour method 
        *  and the "video_model" model module's selectVideoFrontFourmore method
        *  Finally, load the module of view (video_info) -- HTML
        */
        public function find_video(){

            $url = 'http://'.$_SERVER['HTTP_HOST'].$_SERVER['REQUEST_URI'];
            $parts=explode("/",$url);
            $finalURI=end($parts);
            $result="";
            if(strpos($finalURI,'.') == TRUE){
                $result = substr($finalURI,0,strrpos($finalURI ,"."));
            }else{
                $result = $finalURI;
            }    
            $finished = $this->video_model->selectvideo($result);
            $videolist = $this->video_model->selectvideofrontfour();
            $videolistmore = $this->video_model->selectvideofrontfourmore();
            $videocomments = $this->video_model->showcomments($result);
            $data['listcomments'] = $videocomments;
            $data['listvideo'] = $videolist;
            $data['listdata'] = $finished;
            $data['listdataa'] = $videolistmore;
            $this->load->vars($data);
            $this->load->view('template/header');
            $this->load->view('video_info');

        }

    }