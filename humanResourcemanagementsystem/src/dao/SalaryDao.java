package dao;

import java.util.List;

import exception.SalaryException;
import model.Salary;

public interface SalaryDao {
        public List<Salary> getSalaryDetails(int empid) throws SalaryException;
}
