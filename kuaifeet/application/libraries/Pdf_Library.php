<?php

require_once dirname(__FILE__).'/tcpdf/tcpdf.php';
class Pdf_Library extends TCPDF{

    public function __construct(){
        parent::__construct();
    }

    

}