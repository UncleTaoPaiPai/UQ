<?php

    class product extends CI_Controller{

        /**
        *  In Milestone 3
        *  Constructor, which extends from the CI_Model class
        *  load the module of model (product_model) --- data from database
        *  load the module of model (cart_model) --- data from database
        */
        public function __construct()
        {
            parent::__construct();
            $this->load->model('Product_model');
            $this->load->model('Cart_model');
        }

        /**
        *  In Milestone 3
        *  Pass the database information to the page 
        *  load the module of view (shop) --- HTML 
        */
        public function index(){
            $data['data'] = $this->Product_model->getAllProduct();
            $this->load->view('template/header');
            $this->load->view('shop',$data);
        }

        /**
        *  In Milestone 3
        *  Add item
        */
        public function add_to_cart(){

            $data= array(
                'id' =>$this->input->post('id'),
                'name' =>$this->input->post('name'),
                'price' =>$this->input->post('price'),
                'qty' =>$this->input->post('qty'),
            );
            $this->cart->insert($data);
            echo $this->show_cart();
        }

        /**
        *  In Milestone 3
        *  show cart
        */
        public function show_cart(){
            $output = '';
            $times = 0;
            foreach ($this->cart->contents() as $items) {
                $times++;
                $output .='
                    <tr>
                        <td style="color:#ffffff;">'.$items['name'].'</td>
                        <td style="color:#ffffff;">'.number_format($items['price']).'</td>
                        <td style="color:#ffffff;">'.$items['qty'].'</td>
                        <td style="color:#ffffff;">'.number_format($items['subtotal']).'</td>
                        <td><button type="button" id="'.$items['rowid'].'" class="remove_cart btn btn-danger btn-sm">CLEAR</button></td>
                    </tr>
                ';
            }
            $output .= '
                <tr>
                    <th colspan="4" style="color:#ffffff;">total</th>
                    <th colspan="1" id="total" style="color:#ffffff;">'.'AUD'.number_format($this->cart->total()).'</th>
                </tr>
            ';
            return $output;
        }

        /**
        *  In Milestone 3
        *  show cart
        */
        public function load_cart(){
            echo $this->show_cart();
        }

         /**
        *  In Milestone 3
        *  delete item
        */
        public function delete_cart(){
            $data=array(
                'rowid' =>$this->input->post('row_id'),
                'qty' =>0,
            );
            $this->cart->update($data);
            echo $this->show_cart();
        }

         /**
        *  In Milestone 3
        *  show order
        */
        public function order(){

            $data['money'] =$this->cart->contents();
            $rowid;
            $name;
            $qty;
            $price;
            $subtotal;
            foreach($this->cart->contents() as $items){
                $rowid= $items["rowid"];
                $name = $items['name'];
                $qty = $items['qty'];
                $price = $items['price'];
                $subtotal = $items['subtotal'];
            }
            $bool = $this->Cart_model->addorder($rowid,$name,$qty,$price,$subtotal);            
            $this->load->view('template/header');
            $this->load->view('checkout',$data);

        }

    }