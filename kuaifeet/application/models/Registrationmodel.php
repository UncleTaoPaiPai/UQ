<?php

    class registrationmodel extends CI_Model{

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
        * reset the password
        *
        * @param: string $username user's username
        * @param: string $password user's passowrd 
        * @return：bool determine whether to reset the password  
        */
        public function restartpassword($username,$password){
            $data=array(
                'password' => $password,
            );
            $bool = $this->db->update('users',$data,array('username'=>$username));
            return $bool;
        }

        /**
        * In Milestone 2 
        * Registered account
        *
        * @param: string $username user's username
        * @param: string $password user's passowrd 
        * @param: string $email user's email
        * @param: string $safe_question user's safe_question
        * @param: string $safe_question user's question_answer
        * @param: string $safe_question user's name      
        * @return：bool Determine whether the registration is successful 
        */
        public function go_register($username,$password,$email,$safe_question,$question_answer,$name,$vcode){

            $newpwd = md5(md5(md5(md5(md5(md5(md5($password)))))));
            $data = array(
                'username'=>$username,
                'password'=>$newpwd,
                'email'=>$email,
                'safe_question'=>$safe_question,
                'question_answer'=>$question_answer,
                'name'=>$name,
                'vcode'=>$vcode,
            );
            $this->db->insert('users',$data);
            return TRUE; 

        }

       /**
        * In Milestone 2 
        *
        * make passwords more secure
        *
        * @param: string $password user's passowrd 
        * @return：string A more secure password
        */
        public function more_hardpwd($password){
            $hardpwd = password_hash($password, PASSWORD_DEFAULT);
            return $hardpwd;
        }

    }