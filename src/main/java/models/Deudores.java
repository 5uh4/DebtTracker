package models;

public class Deudores {

	public String deudor;
	public double ultimoPagoQ;
	public double deudaPendiente;
	public String fechaUltimoPago;
	public String fechaSiguientePago;
	
	public Deudores(String deudor, double ultimoPagoQ, double deudaPendiente, String fechaUltimoPago,
			String fechaSiguientePago) {
		super();
		this.deudor = deudor;
		this.ultimoPagoQ = ultimoPagoQ;
		this.deudaPendiente = deudaPendiente;
		this.fechaUltimoPago = fechaUltimoPago;
		this.fechaSiguientePago = fechaSiguientePago;
	}
	
	@Override
	public String toString() {
		return "Deudores [Nombre del moroso=" + deudor + ", Dinero pagado la ultima vez=" + ultimoPagoQ + ", deuda pendiente=" + deudaPendiente
				+ ", fecha del ultimo pago=" + fechaUltimoPago + ", fecha del siguiente pago=" + fechaSiguientePago + "]";
	}

	public String getDeudor() {
		return deudor;
	}
	public void setDeudor(String deudor) {
		this.deudor = deudor;
	}
	public double getUltimoPagoQ() {
		return ultimoPagoQ;
	}
	public void setUltimoPagoQ(double ultimoPagoQ) {
		this.ultimoPagoQ = ultimoPagoQ;
	}
	public double getDeudaPendiente() {
		return deudaPendiente;
	}
	public void setDeudaPendiente(double deudaPendiente) {
		this.deudaPendiente = deudaPendiente;
	}
	public String getFechaUltimoPago() {
		return fechaUltimoPago;
	}
	public void setFechaUltimoPago(String fechaUltimoPago) {
		this.fechaUltimoPago = fechaUltimoPago;
	}
	public String getFechaSiguientePago() {
		return fechaSiguientePago;
	}
	public void setFechaSiguientePago(String fechaSiguientePago) {
		this.fechaSiguientePago = fechaSiguientePago;
	}
	
	
}
