package Candidate_Management_system.service;

import Candidate_Management_system.service.ipml.InputException;

public interface CandidateManagementSystem {
    void add();
    void edit(int index);
    void delete(String firstName);
    void display();
    void search(String firstName);
}
