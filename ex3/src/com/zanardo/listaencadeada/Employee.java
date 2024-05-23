package com.zanardo.listaencadeada;

public class Employee {
	    String name;
	    String role;
	    double income;

	    Employee(String name, String role, double income) {
	        this.name = name;
	        this.role = role;
	        this.income = income;
	    }

	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public double getIncome() {
			return income;
		}

		public void setIncome(double income) {
			this.income = income;
		}

		@Override
	    public String toString() {
	        return "Nome: " + name + ", Cargo: " + role + ", Salário: " + income;
	    }
	}

