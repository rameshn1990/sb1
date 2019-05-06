package com.yhayahi30.springboot;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDataRepository extends JpaRepository<MyData, Long>{
	
	public Optional<MyData> findById(Long name);

	public void deleteById(MyData mydata);
	
}
