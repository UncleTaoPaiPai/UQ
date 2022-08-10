<?php
defined('BASEPATH') OR exit('No direct script access allowed');
class Email extends CI_Controller
{

    /**
    *  In Milestone 3
    *  Constructor, which extends from the CI_Model class
    *  load the module of model (status)
    */
    public function __construct() {
    
        parent::__construct();
        $this->load->model('status');
        $this->load->library('session');

    }

    /**
    *  In Milestone 3
    *  load the module of view (emailcode) --- HTML 
    */
    public function index() {

        $this->load->view('emailcode');
    
    }

    /**
    *  In Milestone 3
    *  Check that the data entered from the front end 
    *  is the same as the data in the database 
    */
    public function checkcode(){

        $username = $_SESSION['username'];
        $code=$this->status->getvcode($username);
        $vcode=$this->input->post('code');

        if($vcode == $code->vcode){
            $bool=$this->status->changestatus($username);
            if($bool==TRUE){
                $this->load->view('template/header');
                $this->load->view('userupdate');
            }else{
                $this->load->view('vcode');
            }
        }else{
            $this->load->view('vcode');
        }

    }

    /**
    *  In Milestone 3
    *  Send the verification code to the user
    */
    public function send(){
    
        $username = $_SESSION['username'];
        $code=$this->status->getvcode($username);
       
        $config = Array(
            'protocol' => 'smtp',
            'smtp_host' => 'mailhub.eait.uq.edu.au',
            'smtp_port' => 25,
            'mailtype' => 'html',
            'charset' => 'iso-8859-1',
            'wordwrap' => TRUE ,
            'mailtype' => 'html',
            'starttls' => true,
            'newline' => "\r\n"
            );
           
        $this->email->initialize($config);
        $this->email->from(get_current_user().'@student.uq.edu.au',get_current_user());
        $this->email->to($this->input->post('email'));        
        $this->email->message("Your code is:".$code->vcode);
        $this->email->send();
        $this->load->view('vcode');
        
    }

}

?>