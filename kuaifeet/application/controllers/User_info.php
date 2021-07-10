<?php

    class user_info extends CI_Controller{

        /**
        *  In Milestone 2 
        *  load the module of view (users) --- HTML 
        */
        public function index(){

            $this->load->view('template/header');
            $this->load->view('users');
        }

        /**
        * In Milestone 2 
        * Load all data in the database the module of view (users) -- HTML
        */
        public function showall(){

            $this->load->model('userinfomodel');
            $this->load->model('video_model');
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
            $da=$this->userinfomodel->getinfo();
            $data['listdata'] = $da; 
            $this->load->vars($data);
            $this->load->view('template/header');
            $this->load->view('user');
        }

    }