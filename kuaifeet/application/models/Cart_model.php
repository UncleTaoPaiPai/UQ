<?php


    class cart_model extends CI_Model{

         /**
        *  In Milestone 3
        *  Constructor, which extends from the CI_Model class
        */
        public function __construct()
        {
            parent::__construct();
        }

        /**
        * In Milestone 3 
        * All of the order's information
        *
        * @return：array all of the order's information
        */
        public function getorder(){
            return $this->db->get('order')->result();
        }

        /**
        * In Milestone 3 
        * All of the cart's information
        *
        * @return：array all of the cart's information
        */
        public function getAll(){
            $sql = "select * from shop";

            $query = $this->db->query($sql);
            return $query->result_array();
        }

        /**
        * In Milestone 3 
        * Determine whether the addition was successful
        *
        * @param: string $id user's id
        * @return：bool determine whether the addition was successful 
        */
        public function add($id){
            $sql = "select * from shop where id = ?";
            $rel=$this->db->query($sql,$id);
            return $rel->result();
        }

        /**
        * In Milestone 3 
        * Determine whether the addition was successful
        *
        * @param: integer $rowid order's id
        * @param: string $name order's name
        * @param: integer $qty order's qty
        * @param: integer $price order's price
        * @param: integer $subtotal order's subtotal
        * @return：bool determine whether the addition was successful 
        */
        public function addorder($rowid, $name, $qty, $price, $subtotal){
            
            $data=array(
                'rowid'=>$rowid,
                'name'=>$name,
                'qty'=>$qty,
                'price'=>$price,
                'subtotal'=>$subtotal,
            );

            $bool = $this->db->insert('order',$data);
            return $bool;
        }

    }