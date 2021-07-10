<?php

    class status extends CI_Model{
        
        /**
        * In Milestone 3 
        * Get user's E-mail validation status
        *
        * @param: string $username user's username
        * @return：array all of the status's information
        */
        public function getstatus($username){
            $sql="select status from users where username = ?";
            $rel=$this->db->query($sql,$username);
            return $rel->row();
        }

        /**
        * In Milestone 3 
        * Get user's E-mail validation vcode
        *
        * @param: string $username user's username
        * @return：array all of the vcode's information
        */
        public function getvcode($username){
            
            $sql="select vcode from users where username = ?";
            $rel=$this->db->query($sql,$username);
            return $rel->row();
        
        }

        /**
        * In Milestone 3 
        * change user's E-mail validation status
        *
        * @param: string $username user's username
        * @return：array all of the status's information
        */
        public function changestatus($username){
            $data=array(
                'status'=>1,
            );
            $bool=$this->db->update('users',$data,array('username'=>$username));
            return $bool;
        }

    }