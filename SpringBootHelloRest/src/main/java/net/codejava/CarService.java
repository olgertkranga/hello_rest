package net.codejava;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CarService {

	@Autowired
	private CarRepository repoCar;

	public List<Cars> listAll() {
		return repoCar.findAll();
	}

	public void save(Cars cars) {
		repoCar.save(cars);
	}

	public Cars get(Integer id) {
		return repoCar.findById(id).get();
	}

	public void delete(Integer id) {
		repoCar.deleteById(id);
	}
}