<?php
class profil extends CI_Controller{
	function __construct(){
		parent::__construct();
		$this->load->helper(array('url'));
	}
	public function index()
	{
		$this->load->model('m_admin');
		$query = $this->m_admin->get();
		$data= array(
				'template' => 'Tampil profil pengguna',
				'admin' => $query->result(),
		);
		$this->load->view('template', $data);
		$this->load->view('v_profil');
		}
	}
?>