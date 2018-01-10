package nodomain.stswoon.lectures.js.performance;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class CitiesController {
    @RequestMapping(value={"/cities", "cities/{search}"})
    public List<String> getCities(@PathVariable Optional<String> search) {
        if (search.isPresent()) {
            return cities.stream().filter(city -> city.contains(search.get())).collect(Collectors.toList());
        }
        return cities;
    }

    final static String s = "Abakan\n" +
            "Abaza\n" +
            "Abdulino\n" +
            "Abinsk\n" +
            "Achinsk\n" +
            "Adygeysk\n" +
            "Agidel\n" +
            "Agryz\n" +
            "Ak-Dovurak\n" +
            "Akhtubinsk\n" +
            "Aksay\n" +
            "Alagir\n" +
            "Alapayevsk\n" +
            "Alatyr\n" +
            "Aldan\n" +
            "Aleksin\n" +
            "Alexandrov\n" +
            "Alexandrovsk\n" +
            "Alexandrovsk-Sakhalinsky\n" +
            "Alexeyevka\n" +
            "Aleysk\n" +
            "Almetyevsk\n" +
            "Alzamay\n" +
            "Amursk\n" +
            "Anadyr\n" +
            "Anapa\n" +
            "Andreapol\n" +
            "Angarsk\n" +
            "Aniva\n" +
            "Anzhero-Sudzhensk\n" +
            "Apatity\n" +
            "Aprelevka\n" +
            "Apsheronsk\n" +
            "Aramil\n" +
            "Ardatov\n" +
            "Ardon\n" +
            "Argun\n" +
            "Arkadak\n" +
            "Arkhangelsk\n" +
            "Armavir\n" +
            "Arsenyev\n" +
            "Arsk\n" +
            "Artyom\n" +
            "Artyomovsk\n" +
            "Artyomovsky\n" +
            "Arzamas\n" +
            "Asbest\n" +
            "Asha\n" +
            "Asino\n" +
            "Astrakhan\n" +
            "Atkarsk\n" +
            "Aznakayevo\n" +
            "Azov\n" +
            "Babayevo\n" +
            "Babushkin\n" +
            "Bagrationovsk\n" +
            "Bakal\n" +
            "Baksan\n" +
            "Balabanovo\n" +
            "Balakhna\n" +
            "Balakovo\n" +
            "Balashikha\n" +
            "Balashov\n" +
            "Baley\n" +
            "Baltiysk\n" +
            "Barabinsk\n" +
            "Barnaul\n" +
            "Barysh\n" +
            "Bataysk\n" +
            "Bavly\n" +
            "Baykalsk\n" +
            "Baymak\n" +
            "Belaya Kalitva\n" +
            "Belaya Kholunitsa\n" +
            "Belebey\n" +
            "Belgorod\n" +
            "Belinsky\n" +
            "Belogorsk\n" +
            "Belokurikha\n" +
            "Belomorsk\n" +
            "Belorechensk\n" +
            "Beloretsk\n" +
            "Belousovo\n" +
            "Belovo\n" +
            "Beloyarsky\n" +
            "Belozersk\n" +
            "Bely\n" +
            "Belyov\n" +
            "Berdsk\n" +
            "Berezniki\n" +
            "Berezovsky\n" +
            "Berezovsky\n" +
            "Beslan\n" +
            "Bezhetsk\n" +
            "Bikin\n" +
            "Bilibino\n" +
            "Birobidzhan\n" +
            "Birsk\n" +
            "Biryuch\n" +
            "Biryusinsk\n" +
            "Biysk\n" +
            "Blagodarny\n" +
            "Blagoveshchensk\n" +
            "Blagoveshchensk\n" +
            "Bobrov\n" +
            "Bodaybo\n" +
            "Bogdanovich\n" +
            "Bogoroditsk\n" +
            "Bogorodsk\n" +
            "Bogotol\n" +
            "Boguchar\n" +
            "Boksitogorsk\n" +
            "Bolgar\n" +
            "Bolkhov\n" +
            "Bologoye\n" +
            "Bolokhovo\n" +
            "Bolotnoye\n" +
            "Bolshoy Kamen\n" +
            "Bor\n" +
            "Borisoglebsk\n" +
            "Borodino\n" +
            "Borovichi\n" +
            "Borovsk\n" +
            "Borzya\n" +
            "Bratsk\n" +
            "Bronnitsy\n" +
            "Bryansk\n" +
            "Budyonnovsk\n" +
            "Bugulma\n" +
            "Buguruslan\n" +
            "Buinsk\n" +
            "Buturlinovka\n" +
            "Buy\n" +
            "Buynaksk\n" +
            "Buzuluk\n" +
            "Chadan\n" +
            "Chapayevsk\n" +
            "Chaplygin\n" +
            "Chaykovsky\n" +
            "Chebarkul\n" +
            "Cheboksary\n" +
            "Chegem\n" +
            "Chekalin\n" +
            "Chekhov\n" +
            "Chelyabinsk\n" +
            "Cherdyn\n" +
            "Cheremkhovo\n" +
            "Cherepanovo\n" +
            "Cherepovets\n" +
            "Cherkessk\n" +
            "Chernogolovka\n" +
            "Chernogorsk\n" +
            "Chernushka\n" +
            "Chernyakhovsk\n" +
            "Chistopol\n" +
            "Chita\n" +
            "Chkalovsk\n" +
            "Chudovo\n" +
            "Chukhloma\n" +
            "Chulym\n" +
            "Chusovoy\n" +
            "Chyormoz\n" +
            "Dagestanskiye Ogni\n" +
            "Dalmatovo\n" +
            "Dalnegorsk\n" +
            "Dalnerechensk\n" +
            "Danilov\n" +
            "Dankov\n" +
            "Davlekanovo\n" +
            "Dedovsk\n" +
            "Degtyarsk\n" +
            "Demidov\n" +
            "Derbent\n" +
            "Desnogorsk\n" +
            "Digora\n" +
            "Dimitrovgrad\n" +
            "Divnogorsk\n" +
            "Dmitriyev\n" +
            "Dmitrov\n" +
            "Dmitrovsk\n" +
            "Dno\n" +
            "Dobryanka\n" +
            "Dolgoprudny\n" +
            "Dolinsk\n" +
            "Domodedovo\n" +
            "Donetsk\n" +
            "Donskoy\n" +
            "Dorogobuzh\n" +
            "Drezna\n" +
            "Dubna\n" +
            "Dubovka\n" +
            "Dudinka\n" +
            "Dukhovshchina\n" +
            "Dyatkovo\n" +
            "Dyurtyuli\n" +
            "Dzerzhinsk\n" +
            "Dzerzhinsky\n" +
            "Elektrogorsk\n" +
            "Elektrostal\n" +
            "Elektrougli\n" +
            "Elista\n" +
            "Engels\n" +
            "Ertil\n" +
            "Fatezh\n" +
            "Fokino\n" +
            "Fokino\n" +
            "Frolovo\n" +
            "Fryazino\n" +
            "Furmanov\n" +
            "Gadzhiyevo\n" +
            "Gagarin\n" +
            "Galich\n" +
            "Gatchina\n" +
            "Gavrilov Posad\n" +
            "Gavrilov-Yam\n" +
            "Gay\n" +
            "Gdov\n" +
            "Gelendzhik\n" +
            "Georgiyevsk\n" +
            "Glazov\n" +
            "Golitsyno\n" +
            "Gorbatov\n" +
            "Gorno-Altaysk\n" +
            "Gornozavodsk\n" +
            "Gornyak\n" +
            "Gorodets\n" +
            "Gorodishche\n" +
            "Gorodovikovsk\n" +
            "Gorokhovets\n" +
            "Goryachy Klyuch\n" +
            "Grayvoron\n" +
            "Gremyachinsk\n" +
            "Grozny\n" +
            "Gryazi\n" +
            "Gryazovets\n" +
            "Gubakha\n" +
            "Gubkin\n" +
            "Gubkinsky\n" +
            "Gudermes\n" +
            "Gukovo\n" +
            "Gulkevichi\n" +
            "Guryevsk\n" +
            "Guryevsk\n" +
            "Gus-Khrustalny\n" +
            "Gusev\n" +
            "Gusinoozyorsk\n" +
            "Gvardeysk\n" +
            "Igarka\n" +
            "Ilansky\n" +
            "Innopolis\n" +
            "Insar\n" +
            "Inta\n" +
            "Inza\n" +
            "Ipatovo\n" +
            "Irbit\n" +
            "Irkutsk\n" +
            "Ishim\n" +
            "Ishimbay\n" +
            "Isilkul\n" +
            "Iskitim\n" +
            "Istra\n" +
            "Ivangorod\n" +
            "Ivanovo\n" +
            "Ivanteyevka\n" +
            "Ivdel\n" +
            "Izberbash\n" +
            "Izhevsk\n" +
            "Izobilny\n" +
            "Kachkanar\n" +
            "Kadnikov\n" +
            "Kalach\n" +
            "Kalach-na-Donu\n" +
            "Kalachinsk\n" +
            "Kaliningrad\n" +
            "Kalininsk\n" +
            "Kaltan\n" +
            "Kaluga\n" +
            "Kalyazin\n" +
            "Kambarka\n" +
            "Kamen-na-Obi\n" +
            "Kamenka\n" +
            "Kamennogorsk\n" +
            "Kamensk-Shakhtinsky\n" +
            "Kamensk-Uralsky\n" +
            "Kameshkovo\n" +
            "Kamyshin\n" +
            "Kamyshlov\n" +
            "Kamyzyak\n" +
            "Kanash\n" +
            "Kandalaksha\n" +
            "Kansk\n" +
            "Karabanovo\n" +
            "Karabash\n" +
            "Karabulak\n" +
            "Karachayevsk\n" +
            "Karachev\n" +
            "Karasuk\n" +
            "Kargat\n" +
            "Kargopol\n" +
            "Karpinsk\n" +
            "Kartaly\n" +
            "Kashin\n" +
            "Kashira\n" +
            "Kasimov\n" +
            "Kasli\n" +
            "Kaspiysk\n" +
            "Katav-Ivanovsk\n" +
            "Kataysk\n" +
            "Kazan\n" +
            "Kedrovy\n" +
            "Kem\n" +
            "Kemerovo\n" +
            "Khabarovsk\n" +
            "Khadyzhensk\n" +
            "Khanty-Mansiysk\n" +
            "Kharabali\n" +
            "Kharovsk\n" +
            "Khasavyurt\n" +
            "Khilok\n" +
            "Khimki\n" +
            "Kholm\n" +
            "Kholmsk\n" +
            "Khotkovo\n" +
            "Khvalynsk\n" +
            "Kimovsk\n" +
            "Kimry\n" +
            "Kinel\n" +
            "Kineshma\n" +
            "Kingisepp\n" +
            "Kirensk\n" +
            "Kireyevsk\n" +
            "Kirillov\n" +
            "Kirishi\n" +
            "Kirov\n" +
            "Kirov\n" +
            "Kirovgrad\n" +
            "Kirovo-Chepetsk\n" +
            "Kirovsk\n" +
            "Kirovsk\n" +
            "Kirs\n" +
            "Kirsanov\n" +
            "Kirzhach\n" +
            "Kiselyovsk\n" +
            "Kislovodsk\n" +
            "Kizel\n" +
            "Kizilyurt\n" +
            "Kizlyar\n" +
            "Klimovsk\n" +
            "Klin\n" +
            "Klintsy\n" +
            "Knyaginino\n" +
            "Kodinsk\n" +
            "Kogalym\n" +
            "Kokhma\n" +
            "Kola\n" +
            "Kolchugino\n" +
            "Kologriv\n" +
            "Kolomna\n" +
            "Kolpashevo\n" +
            "Kolpino\n" +
            "Kommunar\n" +
            "Komsomolsk\n" +
            "Komsomolsk-on-Amur\n" +
            "Konakovo\n" +
            "Kondopoga\n" +
            "Kondrovo\n" +
            "Konstantinovsk\n" +
            "Kopeysk\n" +
            "Korablino\n" +
            "Korenovsk\n" +
            "Korkino\n" +
            "Korocha\n" +
            "Korolyov\n" +
            "Korsakov\n" +
            "Koryazhma\n" +
            "Kosteryovo\n" +
            "Kostomuksha\n" +
            "Kostroma\n" +
            "Kotelnich\n" +
            "Kotelniki\n" +
            "Kotelnikovo\n" +
            "Kotlas\n" +
            "Kotovo\n" +
            "Kotovsk\n" +
            "Kovdor\n" +
            "Kovrov\n" +
            "Kovylkino\n" +
            "Kozelsk\n" +
            "Kozlovka\n" +
            "Kozmodemyansk\n" +
            "Krasavino\n" +
            "Krasnoarmeysk\n" +
            "Krasnoarmeysk\n" +
            "Krasnodar\n" +
            "Krasnogorsk\n" +
            "Krasnokamensk\n" +
            "Krasnokamsk\n" +
            "Krasnoslobodsk\n" +
            "Krasnoslobodsk\n" +
            "Krasnoturyinsk\n" +
            "Krasnoufimsk\n" +
            "Krasnouralsk\n" +
            "Krasnovishersk\n" +
            "Krasnoyarsk\n" +
            "Krasnoye Selo\n" +
            "Krasnozavodsk\n" +
            "Krasnoznamensk\n" +
            "Krasnoznamensk\n" +
            "Krasny Kholm\n" +
            "Krasny Kut\n" +
            "Krasny Sulin\n" +
            "Kremyonki\n" +
            "Kronstadt\n" +
            "Kropotkin\n" +
            "Krymsk\n" +
            "Kstovo\n" +
            "Kubinka\n" +
            "Kudymkar\n" +
            "Kulebaki\n" +
            "Kumertau\n" +
            "Kungur\n" +
            "Kupino\n" +
            "Kurchatov\n" +
            "Kurgan\n" +
            "Kurganinsk\n" +
            "Kurilsk\n" +
            "Kurlovo\n" +
            "Kurovskoye\n" +
            "Kursk\n" +
            "Kurtamysh\n" +
            "Kusa\n" +
            "Kushva\n" +
            "Kuvandyk\n" +
            "Kuvshinovo\n" +
            "Kuybyshev\n" +
            "Kuznetsk\n" +
            "Kyakhta\n" +
            "Kyshtym\n" +
            "Kyzyl\n" +
            "Labinsk\n" +
            "Labytnangi\n" +
            "Ladushkin\n" +
            "Lagan\n" +
            "Laishevo\n" +
            "Lakhdenpokhya\n" +
            "Lakinsk\n" +
            "Langepas\n" +
            "Lebedyan\n" +
            "Leninogorsk\n" +
            "Leninsk\n" +
            "Leninsk-Kuznetsky\n" +
            "Lensk\n" +
            "Lermontov\n" +
            "Lesnoy\n" +
            "Lesosibirsk\n" +
            "Lesozavodsk\n" +
            "Lgov\n" +
            "Likhoslavl\n" +
            "Likino-Dulyovo\n" +
            "Lipetsk\n" +
            "Lipki\n" +
            "Liski\n" +
            "Livny\n" +
            "Lobnya\n" +
            "Lodeynoye Pole\n" +
            "Lomonosov\n" +
            "Losino-Petrovsky\n" +
            "Luga\n" +
            "Lukhovitsy\n" +
            "Lukoyanov\n" +
            "Luza\n" +
            "Lyantor\n" +
            "Lyskovo\n" +
            "Lysva\n" +
            "Lytkarino\n" +
            "Lyuban\n" +
            "Lyubertsy\n" +
            "Lyubim\n" +
            "Lyudinovo\n" +
            "Magadan\n" +
            "Magas\n" +
            "Magnitogorsk\n" +
            "Makarov\n" +
            "Makaryev\n" +
            "Makhachkala\n" +
            "Makushino\n" +
            "Malaya Vishera\n" +
            "Malgobek\n" +
            "Malmyzh\n" +
            "Maloarkhangelsk\n" +
            "Maloyaroslavets\n" +
            "Mamadysh\n" +
            "Mamonovo\n" +
            "Manturovo\n" +
            "Mariinsk\n" +
            "Mariinsky Posad\n" +
            "Marks\n" +
            "Maykop\n" +
            "Maysky\n" +
            "Mednogorsk\n" +
            "Medvezhyegorsk\n" +
            "Medyn\n" +
            "Megion\n" +
            "Melenki\n" +
            "Meleuz\n" +
            "Mendeleyevsk\n" +
            "Menzelinsk\n" +
            "Meshchovsk\n" +
            "Mezen\n" +
            "Mezhdurechensk\n" +
            "Mezhgorye\n" +
            "Mglin\n" +
            "Miass\n" +
            "Michurinsk\n" +
            "Mikhaylov\n" +
            "Mikhaylovka\n" +
            "Mikhaylovsk\n" +
            "Mikhaylovsk\n" +
            "Mikun\n" +
            "Millerovo\n" +
            "Mineralnye Vody\n" +
            "Minusinsk\n" +
            "Minyar\n" +
            "Mirny\n" +
            "Mirny\n" +
            "Mogocha\n" +
            "Monchegorsk\n" +
            "Morozovsk\n" +
            "Morshansk\n" +
            "Mosalsk\n" +
            "Moscow\n" +
            "Moskovsky\n" +
            "Mozdok\n" +
            "Mozhaysk\n" +
            "Mozhga\n" +
            "Mtsensk\n" +
            "Murashi\n" +
            "Muravlenko\n" +
            "Murmansk\n" +
            "Murom\n" +
            "Myshkin\n" +
            "Myski\n" +
            "Mytishchi\n" +
            "Naberezhnye Chelny\n" +
            "Nadym\n" +
            "Nakhodka\n" +
            "Nalchik\n" +
            "Narimanov\n" +
            "Naro-Fominsk\n" +
            "Nartkala\n" +
            "Naryan-Mar\n" +
            "Navashino\n" +
            "Navoloki\n" +
            "Nazarovo\n" +
            "Nazran\n" +
            "Nazyvayevsk\n" +
            "Neftegorsk, Samara Oblast\n" +
            "Neftekamsk\n" +
            "Neftekumsk\n" +
            "Nefteyugansk\n" +
            "Nelidovo\n" +
            "Neman\n" +
            "Nerchinsk\n" +
            "Nerekhta\n" +
            "Neryungri\n" +
            "Nesterov\n" +
            "Nevel\n" +
            "Nevelsk\n" +
            "Nevinnomyssk\n" +
            "Nevyansk\n" +
            "Neya\n" +
            "Nikolayevsk\n" +
            "Nikolayevsk-on-Amur\n" +
            "Nikolsk\n" +
            "Nikolsk\n" +
            "Nikolskoye\n" +
            "Nizhnekamsk\n" +
            "Nizhneudinsk\n" +
            "Nizhnevartovsk\n" +
            "Nizhniye Sergi\n" +
            "Nizhny Lomov\n" +
            "Nizhny Novgorod\n" +
            "Nizhny Tagil\n" +
            "Nizhnyaya Salda\n" +
            "Nizhnyaya Tura\n" +
            "Noginsk\n" +
            "Nolinsk\n" +
            "Norilsk\n" +
            "Novaya Ladoga\n" +
            "Novaya Lyalya\n" +
            "Novoalexandrovsk\n" +
            "Novoaltaysk\n" +
            "Novoanninsky\n" +
            "Novocheboksarsk\n" +
            "Novocherkassk\n" +
            "Novodvinsk\n" +
            "Novokhopyorsk\n" +
            "Novokubansk\n" +
            "Novokuybyshevsk\n" +
            "Novokuznetsk\n" +
            "Novomichurinsk\n" +
            "Novomoskovsk\n" +
            "Novopavlovsk\n" +
            "Novorossiysk\n" +
            "Novorzhev\n" +
            "Novoshakhtinsk\n" +
            "Novosibirsk\n" +
            "Novosil\n" +
            "Novosokolniki\n" +
            "Novotroitsk\n" +
            "Novoulyanovsk\n" +
            "Novouralsk\n" +
            "Novouzensk\n" +
            "Novovoronezh\n" +
            "Novozybkov\n" +
            "Novy Oskol\n" +
            "Novy Urengoy\n" +
            "Noyabrsk\n" +
            "Nurlat\n" +
            "Nyagan\n" +
            "Nyandoma\n" +
            "Nyazepetrovsk\n" +
            "Nytva\n" +
            "Nyurba\n" +
            "Ob\n" +
            "Obluchye\n" +
            "Obninsk\n" +
            "Oboyan\n" +
            "Ochyor\n" +
            "Odintsovo\n" +
            "Okha\n" +
            "Okhansk\n" +
            "Oktyabrsk\n" +
            "Oktyabrsky\n" +
            "Okulovka\n" +
            "Olenegorsk\n" +
            "Olonets\n" +
            "Olyokminsk\n" +
            "Omsk\n" +
            "Omutninsk\n" +
            "Onega\n" +
            "Opochka\n" +
            "Orekhovo-Zuyevo\n" +
            "Orenburg\n" +
            "Orlov\n" +
            "Orsk\n" +
            "Oryol\n" +
            "Osa\n" +
            "Osinniki\n" +
            "Ostashkov\n" +
            "Ostrogozhsk\n" +
            "Ostrov\n" +
            "Ostrovnoy\n" +
            "Otradnoye\n" +
            "Otradny\n" +
            "Ozherelye\n" +
            "Ozyorsk\n" +
            "Ozyorsk\n" +
            "Ozyory\n" +
            "Pallasovka\n" +
            "Partizansk\n" +
            "Pavlovo\n" +
            "Pavlovsk\n" +
            "Pavlovsk\n" +
            "Pavlovsky Posad\n" +
            "Pechora\n" +
            "Pechory\n" +
            "Penza\n" +
            "Pereslavl-Zalessky\n" +
            "Peresvet\n" +
            "Perevoz\n" +
            "Perm\n" +
            "Pervomaysk\n" +
            "Pervouralsk\n" +
            "Pestovo\n" +
            "Petergof\n" +
            "Petropavlovsk-Kamchatsky\n" +
            "Petrov Val\n" +
            "Petrovsk\n" +
            "Petrovsk-Zabaykalsky\n" +
            "Petrozavodsk\n" +
            "Petukhovo\n" +
            "Petushki\n" +
            "Pevek\n" +
            "Pikalyovo\n" +
            "Pionersky\n" +
            "Pitkyaranta\n" +
            "Plast\n" +
            "Plavsk\n" +
            "Plyos\n" +
            "Pochep\n" +
            "Pochinok\n" +
            "Podolsk\n" +
            "Podporozhye\n" +
            "Pokachi\n" +
            "Pokhvistnevo\n" +
            "Pokrov\n" +
            "Pokrovsk\n" +
            "Polessk\n" +
            "Polevskoy\n" +
            "Polyarny\n" +
            "Polyarnye Zori\n" +
            "Polysayevo\n" +
            "Porkhov\n" +
            "Poronaysk\n" +
            "Poshekhonye\n" +
            "Povorino\n" +
            "Pravdinsk\n" +
            "Primorsk\n" +
            "Primorsko-Akhtarsk\n" +
            "Priozersk\n" +
            "Privolzhsk\n" +
            "Prokhladny\n" +
            "Prokopyevsk\n" +
            "Proletarsk\n" +
            "Protvino\n" +
            "Pskov\n" +
            "Puchezh\n" +
            "Pudozh\n" +
            "Pugachyov\n" +
            "Pushchino\n" +
            "Pushkin\n" +
            "Pushkino\n" +
            "Pustoshka\n" +
            "Pyatigorsk\n" +
            "Pyt-Yakh\n" +
            "Pytalovo\n" +
            "Raduzhny\n" +
            "Raduzhny\n" +
            "Ramenskoye\n" +
            "Rasskazovo\n" +
            "Raychikhinsk\n" +
            "Reutov\n" +
            "Revda\n" +
            "Rezh\n" +
            "Rodniki\n" +
            "Roshal\n" +
            "Roslavl\n" +
            "Rossosh\n" +
            "Rostov\n" +
            "Rostov-on-Don\n" +
            "Rtishchevo\n" +
            "Rubtsovsk\n" +
            "Rudnya\n" +
            "Ruza\n" +
            "Ruzayevka\n" +
            "Ryazan\n" +
            "Ryazhsk\n" +
            "Rybinsk\n" +
            "Rybnoye\n" +
            "Rylsk\n" +
            "Rzhev\n" +
            "Safonovo\n" +
            "Saint Petersburg\n" +
            "Salair\n" +
            "Salavat\n" +
            "Salekhard\n" +
            "Salsk\n" +
            "Samara\n" +
            "Saransk\n" +
            "Sarapul\n" +
            "Saratov\n" +
            "Sarov\n" +
            "Sasovo\n" +
            "Satka\n" +
            "Sayanogorsk\n" +
            "Sayansk\n" +
            "Sebezh\n" +
            "Segezha\n" +
            "Seltso\n" +
            "Semikarakorsk\n" +
            "Semiluki\n" +
            "Semyonov\n" +
            "Sengiley\n" +
            "Serafimovich\n" +
            "Serdobsk\n" +
            "Sergach\n" +
            "Sergiyev Posad\n" +
            "Serov\n" +
            "Serpukhov\n" +
            "Sertolovo\n" +
            "Sestroretsk\n" +
            "Severo-Kurilsk\n" +
            "Severobaykalsk\n" +
            "Severodvinsk\n" +
            "Severomorsk\n" +
            "Severouralsk\n" +
            "Seversk\n" +
            "Sevsk\n" +
            "Shadrinsk\n" +
            "Shagonar\n" +
            "Shakhty\n" +
            "Shakhtyorsk\n" +
            "Shakhunya\n" +
            "Shali\n" +
            "Sharya\n" +
            "Sharypovo\n" +
            "Shatsk\n" +
            "Shatura\n" +
            "Shcherbinka\n" +
            "Shchigry\n" +
            "Shchuchye\n" +
            "Shchyokino\n" +
            "Shchyolkovo\n" +
            "Shebekino\n" +
            "Shelekhov\n" +
            "Shenkursk\n" +
            "Shikhany\n" +
            "Shilka\n" +
            "Shimanovsk\n" +
            "Shlisselburg\n" +
            "Shumerlya\n" +
            "Shumikha\n" +
            "Shuya\n" +
            "Sibay\n" +
            "Sim\n" +
            "Skopin\n" +
            "Skovorodino\n" +
            "Slantsy\n" +
            "Slavgorod\n" +
            "Slavsk\n" +
            "Slavyansk-na-Kubani\n" +
            "Slobodskoy\n" +
            "Slyudyanka\n" +
            "Smolensk\n" +
            "Snezhinsk\n" +
            "Snezhnogorsk\n" +
            "Sobinka\n" +
            "Sochi\n" +
            "Sokol\n" +
            "Sokolniki\n" +
            "Sol-Iletsk\n" +
            "Soligalich\n" +
            "Solikamsk\n" +
            "Solnechnogorsk\n" +
            "Soltsy\n" +
            "Solvychegodsk\n" +
            "Sorochinsk\n" +
            "Sorsk\n" +
            "Sortavala\n" +
            "Sosensky\n" +
            "Sosnogorsk\n" +
            "Sosnovka\n" +
            "Sosnovoborsk\n" +
            "Sosnovy Bor\n" +
            "Sovetsk\n" +
            "Sovetsk\n" +
            "Sovetsk\n" +
            "Sovetskaya Gavan\n" +
            "Sovetsky\n" +
            "Spas-Demensk\n" +
            "Spas-Klepiki\n" +
            "Spassk\n" +
            "Spassk-Dalny\n" +
            "Spassk-Ryazansky\n" +
            "Srednekolymsk\n" +
            "Sredneuralsk\n" +
            "Sretensk\n" +
            "Staraya Kupavna\n" +
            "Staraya Russa\n" +
            "Staritsa\n" +
            "Starodub\n" +
            "Stary Oskol\n" +
            "Stavropol\n" +
            "Sterlitamak\n" +
            "Strezhevoy\n" +
            "Stroitel\n" +
            "Strunino\n" +
            "Stupino\n" +
            "Sudogda\n" +
            "Sudzha\n" +
            "Sukhinichi\n" +
            "Sukhoy Log\n" +
            "Suoyarvi\n" +
            "Surazh\n" +
            "Surgut\n" +
            "Surovikino\n" +
            "Sursk\n" +
            "Susuman\n" +
            "Suvorov\n" +
            "Suzdal\n" +
            "Svetlogorsk\n" +
            "Svetlograd\n" +
            "Svetly\n" +
            "Svetogorsk\n" +
            "Svirsk\n" +
            "Svobodny\n" +
            "Syasstroy\n" +
            "Sychyovka\n" +
            "Syktyvkar\n" +
            "Sysert\n" +
            "Syzran\n" +
            "Taganrog\n" +
            "Taldom\n" +
            "Talitsa\n" +
            "Tambov\n" +
            "Tara\n" +
            "Tarko-Sale\n" +
            "Tarusa\n" +
            "Tashtagol\n" +
            "Tatarsk\n" +
            "Tavda\n" +
            "Tayga\n" +
            "Tayshet\n" +
            "Teberda\n" +
            "Temnikov\n" +
            "Temryuk\n" +
            "Terek\n" +
            "Tetyushi\n" +
            "Teykovo\n" +
            "Tikhoretsk\n" +
            "Tikhvin\n" +
            "Timashyovsk\n" +
            "Tobolsk\n" +
            "Toguchin\n" +
            "Tolyatti\n" +
            "Tomari\n" +
            "Tommot\n" +
            "Tomsk\n" +
            "Topki\n" +
            "Toropets\n" +
            "Torzhok\n" +
            "Tosno\n" +
            "Totma\n" +
            "Troitsk\n" +
            "Troitsk\n" +
            "Trubchevsk\n" +
            "Tryokhgorny\n" +
            "Tsimlyansk\n" +
            "Tsivilsk\n" +
            "Tuapse\n" +
            "Tula\n" +
            "Tulun\n" +
            "Turan\n" +
            "Turinsk\n" +
            "Tutayev\n" +
            "Tuymazy\n" +
            "Tver\n" +
            "Tynda\n" +
            "Tyrnyauz\n" +
            "Tyukalinsk\n" +
            "Tyumen\n" +
            "Uchaly\n" +
            "Udachny\n" +
            "Udomlya\n" +
            "Ufa\n" +
            "Uglegorsk\n" +
            "Uglich\n" +
            "Ukhta\n" +
            "Ulan-Ude\n" +
            "Ulyanovsk\n" +
            "Unecha\n" +
            "Uray\n" +
            "Uren\n" +
            "Urus-Martan\n" +
            "Uryupinsk\n" +
            "Urzhum\n" +
            "Usinsk\n" +
            "Usman\n" +
            "Usolye\n" +
            "Usolye-Sibirskoye\n" +
            "Ussuriysk\n" +
            "Ust-Dzheguta\n" +
            "Ust-Ilimsk\n" +
            "Ust-Katav\n" +
            "Ust-Kut\n" +
            "Ust-Labinsk\n" +
            "Ustyuzhna\n" +
            "Uvarovo\n" +
            "Uyar\n" +
            "Uzhur\n" +
            "Uzlovaya\n" +
            "Valday\n" +
            "Valuyki\n" +
            "Velikiye Luki\n" +
            "Veliky Novgorod\n" +
            "Veliky Ustyug\n" +
            "Velizh\n" +
            "Velsk\n" +
            "Venyov\n" +
            "Vereshchagino\n" +
            "Vereya\n" +
            "Verkhneuralsk\n" +
            "Verkhny Tagil\n" +
            "Verkhny Ufaley\n" +
            "Verkhnyaya Pyshma\n" +
            "Verkhnyaya Salda\n" +
            "Verkhnyaya Tura\n" +
            "Verkhoturye\n" +
            "Verkhoyansk\n" +
            "Vesyegonsk\n" +
            "Vetluga\n" +
            "Vichuga\n" +
            "Vidnoye\n" +
            "Vikhorevka\n" +
            "Vilyuchinsk\n" +
            "Vilyuysk\n" +
            "Vladikavkaz\n" +
            "Vladimir\n" +
            "Vladivostok\n" +
            "Volchansk\n" +
            "Volgodonsk\n" +
            "Volgograd\n" +
            "Volgorechensk\n" +
            "Volkhov\n" +
            "Volodarsk\n" +
            "Vologda\n" +
            "Volokolamsk\n" +
            "Volosovo\n" +
            "Volsk\n" +
            "Volzhsk\n" +
            "Volzhsky\n" +
            "Vorkuta\n" +
            "Voronezh\n" +
            "Vorsma\n" +
            "Voskresensk\n" +
            "Votkinsk\n" +
            "Vsevolozhsk\n" +
            "Vuktyl\n" +
            "Vyatskiye Polyany\n" +
            "Vyazemsky\n" +
            "Vyazma\n" +
            "Vyazniki\n" +
            "Vyborg\n" +
            "Vyksa\n" +
            "Vyshny Volochyok\n" +
            "Vysokovsk\n" +
            "Vysotsk\n" +
            "Vytegra\n" +
            "Yadrin\n" +
            "Yakhroma\n" +
            "Yakutsk\n" +
            "Yalutorovsk\n" +
            "Yanaul\n" +
            "Yaransk\n" +
            "Yaroslavl\n" +
            "Yarovoye\n" +
            "Yartsevo\n" +
            "Yasnogorsk\n" +
            "Yasny\n" +
            "Yefremov\n" +
            "Yegoryevsk\n" +
            "Yekaterinburg\n" +
            "Yelabuga\n" +
            "Yelets\n" +
            "Yelizovo\n" +
            "Yelnya\n" +
            "Yemanzhelinsk\n" +
            "Yemva\n" +
            "Yeniseysk\n" +
            "Yermolino\n" +
            "Yershov\n" +
            "Yessentuki\n" +
            "Yeysk\n" +
            "Yoshkar-Ola\n" +
            "Yubileyny\n" +
            "Yugorsk\n" +
            "Yukhnov\n" +
            "Yurga\n" +
            "Yuryev-Polsky\n" +
            "Yuryevets\n" +
            "Yuryuzan\n" +
            "Yuzha\n" +
            "Yuzhno-Sakhalinsk\n" +
            "Yuzhno-Sukhokumsk\n" +
            "Yuzhnouralsk\n" +
            "Zadonsk\n" +
            "Zainsk\n" +
            "Zakamensk\n" +
            "Zaozyorny\n" +
            "Zaozyorsk\n" +
            "Zapadnaya Dvina\n" +
            "Zapolyarny\n" +
            "Zaraysk\n" +
            "Zarechny\n" +
            "Zarechny\n" +
            "Zarinsk\n" +
            "Zavitinsk\n" +
            "Zavodoukovsk\n" +
            "Zavolzhsk\n" +
            "Zavolzhye\n" +
            "Zelenodolsk\n" +
            "Zelenogorsk\n" +
            "Zelenogorsk\n" +
            "Zelenograd\n" +
            "Zelenogradsk\n" +
            "Zelenokumsk\n" +
            "Zernograd\n" +
            "Zeya\n" +
            "Zheleznodorozhny\n" +
            "Zheleznogorsk\n" +
            "Zheleznogorsk\n" +
            "Zheleznogorsk-Ilimsky\n" +
            "Zheleznovodsk\n" +
            "Zherdevka\n" +
            "Zhigulyovsk\n" +
            "Zhirnovsk\n" +
            "Zhizdra\n" +
            "Zhukov\n" +
            "Zhukovka\n" +
            "Zhukovsky\n" +
            "Zima\n" +
            "Zlatoust\n" +
            "Zlynka\n" +
            "Zmeinogorsk\n" +
            "Znamensk\n" +
            "Zubtsov\n" +
            "Zuyevka\n" +
            "Zvenigorod\n" +
            "Zvenigovo\n" +
            "Zverevo";

    List<String> cities = Arrays.asList(s.split("\n"));
}