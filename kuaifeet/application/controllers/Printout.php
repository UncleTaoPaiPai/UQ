<?php
 
 class printout extends CI_Controller{

    /**
        *  In Milestone 3 
        *  Constructor, which extends from the CI_Model class
        *  load the module of library (Pdf_Library)
        *  load the module of model (Cart_model)
        */
    public function __construct()
    {
        parent::__construct();
        $this->load->library('Pdf_Library');
        $this->load->model('Cart_model');            
    }

     /**
        *  In Milestone 3
        *  Get the data of order from model module Cart_model
        *  Load the module of view (printout)
        */
    public function generate_pdf_report(){
        $data['products'] = $this->Cart_model->getorder();
         $this->load->view('printout',$data);
    }
 }

?>