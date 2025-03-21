package pelis.cloud.peliscloud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PelisController{
     private List<PelisCloud> peliculas = new ArrayList<PelisCloud>();

    public PelisController() {
        peliculas.add(new PelisCloud(1, 2018, "Operación Red Sparrow", "Francis Lawrence", "Suspenso, Espionaje","Dominika Egorova, una bailarina rusa, reclutada por una agencia de espionaje que utiliza la seducción como arma. Su misión la lleva a un peligroso juego de lealtades y traiciones"));
        peliculas.add(new PelisCloud(2, 20180, "Durante la tormenta", "Oriol Paulo", "Thriller, Ciencia Ficción", "Una interferencia temporal permite a Vera salvar a un niño del pasado, pero las consecuencias alteran su presente, llevándola a una realidad donde su hija nunca nació"));
        peliculas.add(new PelisCloud(3, 2018, "El rey proscrito", "David Mackenzie", "Acción, Drama, Histórico", "Un verdadero relato de Robert Bruce, quien se convierte en un héroe, un proscrito, un guerrillero, un rey, mientras lidera su país para liberarse de la opresión inglesa"));
        peliculas.add(new PelisCloud(4, 2018, "El legado del diablo", "Ari Aster", "Terror, Misterio", "Cuando Ellen, la matriarca de la familia Graham, muere, su familia comienza a descubrir secretos crípticos y aterradores sobre su ascendencia. Cuanto más descubren, más se encuentran tratando de escapar del siniestro destino que parecen haber heredado"));
        peliculas.add(new PelisCloud(5, 2018, "El rascacielos", "Rawson Marshall Thurber", "Acción, Thriller", "Un ex líder del equipo de rescate de rehenes del FBI y veterano de guerra estadounidense, Will Ford, ahora evalúa la seguridad de los rascacielos. En China, se ve incriminado cuando el edificio más alto y seguro del mundo de repente se incendia"));
        peliculas.add(new PelisCloud(6, 2018, "El justiciero 2", "Antoine Fuqua", "Acción, Crimen, Drama", "Robert McCall sirve una justicia inquebrantable para los explotados y oprimidos, pero ¿cuánto irá para vengar a alguien que ama?"));
        peliculas.add(new PelisCloud(7, 2018, "El depredador", "Shane Black", "Acción, Aventura, Ciencia Ficción", "De las profundidades del espacio exterior hasta las calles de un suburbio, la caza vuelve a casa en la explosiva reinvención de Shane Black de la serie de depredadores"));
        peliculas.add(new PelisCloud(8, 2018, "El alma de la fiesta", "Ben Falcone", "Comedia", "Cuando su esposo la deja, Deanna convierte la tristeza en alegría al regresar a la universidad, terminando la carrera que dejó años atrás"));
    }
    @GetMapping("/peliculas")
    public List<PelisCloud> getPelisClouds() {
        return peliculas;
    }
    @GetMapping("/peliculas/{id}")
    public PelisCloud getPelisById(@PathVariable int id) {
        for (PelisCloud i : peliculas) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }
}