package com.example.myapplication.utils

import com.example.myapplication.data.CinemaData
import com.example.myapplication.R

object DataDummy {
    fun generateDummymovies(): ArrayList<CinemaData> {
        val movies = ArrayList<CinemaData>()
        movies.add(
            CinemaData(
                "Alita: Battle Angel",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "2019",
                R.drawable.poster_alita,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/8RKBHHRqOMOLh5qW3sS6TSFTd8h.jpg"
            )
        )
        movies.add(
            CinemaData(
                "Aquaman",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "2018",
                R.drawable.poster_aquaman,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/9QusGjxcYvfPD1THg6oW3RLeNn7.jpg"
            )
        )
        movies.add(
            CinemaData(
                "Bohemian Rhapsody",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "2018",
                R.drawable.poster_bohemian,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jNUpYq2jRSwQM89vST9yQZelMSu.jpg"
            )
        )
        movies.add(
            CinemaData(
                "How to Train Your Dragon: The Hidden World",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "2019",
                R.drawable.poster_how_to_train,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/lFwykSz3Ykj1Q3JXJURnGUTNf1o.jpg"
            )
        )
        movies.add(
            CinemaData(
                "Avengers: Infinity War",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "2018",
                R.drawable.poster_infinity_war,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/lmZFxXgJE3vgrciwuDib0N8CfQo.jpg"
            )
        )
        movies.add(
            CinemaData(
                "Mortal Engine",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "2018",
                R.drawable.poster_mortal_engines,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/rm2oMykm5nX6SzXFr7TGHkO6r8Z.jpg"
            )
        )
        movies.add(
            CinemaData(
                "Overlord",
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "2018",
                R.drawable.poster_overlord,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/sHNC8hjAu4ZKXYhG3cp8ghRZ02B.jpg"
            )
        )
        movies.add(
            CinemaData(
                "Ralph Break The Internet",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                "2018",
                R.drawable.poster_ralph,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/qDQEQbgP3v7B9IYLAUcYexNrVYP.jpg"
            )
        )
        movies.add(
            CinemaData(
                "Robin Hood",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "2018",
                R.drawable.poster_robin_hood,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/zSJT1sKGRKcmP4I9b8dIOuepw6I.jpg"
            )
        )
        movies.add(
            CinemaData(
                "Spider-Man: Into the Spider-Verse",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "2018",
                R.drawable.poster_spiderman,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/6qVF0gnLnbKCgcMfCpCB8GH7B5I.jpg"
            )
        )

        return movies
    }
    fun generateDummytvShow(): ArrayList<CinemaData> {
        val tvShow = ArrayList<CinemaData>()
        tvShow.add(
            CinemaData(
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "2018",
                R.drawable.poster_arrow,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/vNnLAKmoczRlNarxyGrrw0KSOeX.jpg"

            )
        )
        tvShow.add(
            CinemaData(
                "Doom Patrol",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "2019",
                R.drawable.poster_doom_patrol,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/kkgomBlNN9UvPhNGQmVMpOwAnXG.jpg"

            )
        )
        tvShow.add(
            CinemaData(
                "Family Guy",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for moviess). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "1999",
                R.drawable.poster_family_guy,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/4h4HETnteDE5wAEptaghTO7KS9Q.jpg"

            )
        )
        tvShow.add(
            CinemaData(
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                R.drawable.poster_flash,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/eyG9srihv68ScRdEbJZj66WT4O0.jpg"

            )
        )
        tvShow.add(
            CinemaData(
                "Hanna",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "2019",
                R.drawable.poster_hanna,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/6Fzyuwn8KeMCSqRILfdrDmCvmod.jpg"

            )
        )
        tvShow.add(
            CinemaData(
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017",
                R.drawable.poster_riverdale,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/urwz7vJ52QJnHH04zPNO1NKghyl.jpg"

            )
        )
        tvShow.add(
            CinemaData(
                "Supergirl",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "2015",
                R.drawable.poster_riverdale,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jgb9xICHFX8wTGQ75js4uNbttQs.jpg"

            )
        )
        tvShow.add(
            CinemaData(
                "Supernatural",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "2005",
                R.drawable.poster_supernatural,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/nVRyd8hlg0ZLxBn9RaI7mUMQLnz.jpg"
            )
        )
        tvShow.add(
            CinemaData(
                "The Simpsons",
                "Set in Springfield, the average American town, the tvShow focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The tvShow has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "1989",
                R.drawable.poster_the_simpson,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/iWsYpPTBvsXxXQcP5imjPZ8F8UX.jpg"
            )
        )
        tvShow.add(
            CinemaData(
                "The Umbrella Academy",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "2019",
                R.drawable.poster_the_umbrella,
                "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/qJxzjUjCpTPvDHldNnlbRC4OqEh.jpg"

            )
        )


        return tvShow
    }

}