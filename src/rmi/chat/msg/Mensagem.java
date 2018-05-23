package rmi.chat.msg;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Mensagem extends Remote
{
	public boolean adicionarUsuario(String usuario) throws RemoteException;
	public void removerUsuario(String usuario)throws RemoteException;
	public String receberMensagem(String usuario, int indice) throws RemoteException;
	//public String receberMensagem(String usuario, String remetente) throws RemoteException;
	public int enviarMensagem(String remetente, String mensagem, String destinatario) throws RemoteException;
	public int enviarMensagem(String remetente, String mensagem, String[] destinatarios) throws RemoteException;
	public int receberQuantidadeMensagens(String usuario) throws RemoteException;
	public String[] getListaUsuarios() throws RemoteException;
	public void checarUsuarios() throws RemoteException;
}
