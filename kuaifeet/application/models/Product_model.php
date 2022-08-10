<?php

    class product_model extends CI_Model{

        /**
        * In Milestone 3 
        * All of the product's information
        *
        * @return：array all of the product's information
        */
        public function getAllProduct(){

            $result = $this->db->get('shop');
            return $result;

        }

    }