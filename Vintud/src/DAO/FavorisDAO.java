package DAO;


import models.Favoris;

public interface FavorisDAO {

	public void creerFavoris () ;
	public Favoris chooseFavorisSpecifications ()  ;
	public void afficherFavoris() ;
	public void supprimerFavoris () ;
	public void RetrouverAnnounce() ;
	public Favoris findFavoriById (int id) ;
	public void modifyFavori()	;
	
	public void enregistrerAnnonceFavori(int idFavori) ;
	public void afficherFavorisForAUser(int idUser) ;
	
	
	
}
