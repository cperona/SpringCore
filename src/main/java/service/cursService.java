package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Curs;
import org.springframework.stereotype.Component;
import repository.cursRepository;

@Component
public class cursService implements crudService<Curs> {
    private cursRepository repositori;

    public cursService(cursRepository cursRepository) {
        repositori = cursRepository;
    }

    public List<Curs> list() {
        // TODO Auto-generated method stub
//		return cursos;
        return repositori.findAll();
    }

    public Curs create(Curs t) {
        // TODO Auto-generated method stub
        return null;
    }

    public Optional<Curs> get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    public void update(Curs t, int id) {
        // TODO Auto-generated method stub

    }

    public void delete(int id) {
        // TODO Auto-generated method stub

    }
}
