package com.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bank.modal.Roa;
import com.bank.modal.Roe;

@Service
public interface RoaService {
	public Roa addRoa(Roa roa);
	public double calculateRoa(Roa roa);
	public Roa getRoaByPeriod();
	public void deleteRoa(int id);
	public List<Roa> allRoa(int n);
	public Roa editRoa(int id, Roa updatedRoa);
}
