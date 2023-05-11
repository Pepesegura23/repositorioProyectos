package com.salesianostriana.dam.base;

import org.springframework.data.jpa.repository.JpaRepository;

public  abstract class BaseServicesImpl<T,ID,R 
	extends JpaRepository<T, ID>> 
	implements BaseService<T, ID>{	//T = tipo de la entidad
	
	protected R repository;
	
	//Todos los métodos iplementar de Baseservice
	

}
