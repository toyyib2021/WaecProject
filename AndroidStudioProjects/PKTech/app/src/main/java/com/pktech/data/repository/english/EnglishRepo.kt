package com.pktech.data.repository.english

import com.pktech.domain.model.Objective
import com.pktech.domain.model.Questions

class EnglishRepo {
    private val section1 = "In the sentence below, there is one underlined word and one gap. From the list of words lettered A to D, choose the one that is most nearly opposite in meaning to the underlined word and that will, at the same time correctly fill the gap in the sentence."
    private val section2 = "From the words lettered A to D, choose the word that best completes each of the following sentences"
    private val section3 = "After each of the following sentences, a list of possible interpretations of the sentence is given. Choose the interpretation that you consider most appropriate for each sentence."
    private val section4 = "From the words lettered A to D below each of the following sentences, choose the word that is nearest in meaning to the underlined word"
    private val section5 = "From the words or group of words lettered A to D, choose the word or group of words that best completes each of the following sentences"
    private val section6 = "In the following passages, the numbered gaps indicate missing words. Against each number in the passage, there are four options lettered A to D. choose the option that is the most suitable to fill the numbered gaps in the passages"

    private val passageA2013 =
        """
            In recent times, more and more people have become aware of the -76- of the stock market and the possibility of making huge profits from investing in stocks and shares. The process is quite easy: a person either buys the shares directly during a public -77- or does so through professional institutions or experts known as stock -78- . Thereafter, the buyer is issued with a share -79- to show that he owns shares in a company.
            Investing in stocks and shares can be for a long or short term. A long-term investor does not hurry to sell his shares at any slight increase in price but instead is satisfied with the -80- which the company sends to him and other -81- annually from the -82- it declares. This is usually paid according to the number of -83- the investor holds. Those who invest for a short-term, on the other hand, sell their shares as soon as they can make reasonable profit from their investment.
            However, it is advisable to be cautious because the stock market can be very -84- and occasionally there are -85- .
        """.trimIndent()

    private val passageB2013 =
        """
        One of the world’s oldest -86- is teaching. There must have been -87- who were respected because they were able to guide and -88- children towards the -89- of the desired goals of their communities. The -90- ceremonies for young adults common to many cultures are part of -91- education process of those cultures .There are also many informal ways of educating the young ones. When a young girl helps her mother in preparing the family -92-, she is learning culinary skills in an informal setting. One’s -93- group has a great influence on one. In the formal set-up of our schools today, education is well -94-. There is the -95- of authority from the principal down to the class -96-. We have a fixed -97- which plays an important role in -98- our attitudes and conditioning our -99- and responses to the demands of our -100-.
    
        """.trimIndent()

    private val english2013 = listOf<Questions>(

        Questions( objective = Objective(
            "1",
             section1,
            "",
            "",
            "Tom is ",
            "A. arrogant",
            "B. crude",
            "C. unskillful",
            "D. foolish",
            "B. crude",
            "refined ",
            "but his brother is rather .......",
        )
        ),


        Questions( objective = Objective(
            "2",
            section1,
            "",
            "",
            "Lions are in ",
            "A. action",
            "B. existence",
            "C. vogue",
            "D. custody",
            "B. existence",
            "extinction ",
            "in The Gambia but monkeys are still in .......",
        )),


        Questions( objective = Objective(
            "3",
            section1,
            "",
            "",
            "Mary's explanation was ",
            "A. long",
            "B. winding",
            "C. vague",
            "D. irrelevant",
            "C. vague",
            "explicit ",
            "but mine was .....",
        )),

        Questions( objective = Objective(
            "4",
            section1,
            "",
            "",
            "The Major demanded an",
            "A. strict",
            "B. wavering",
            "C. clumsy",
            "D. alterable",
            "D. alterable",
            "unalloyed",
            "and not a ....loyalty from his soldiers.",
        )),


        Questions( objective = Objective(
            "5",
            section1,
            "",
            "",
            "The",
            "A. accuracy",
            "B. vagueness",
            "C. clarity",
            "D. verbosity",
            "D. verbosity",
            "brevity",
            "of the President's speech contrasts with the ..... of the Secretary's",
        )),

        Questions( objective = Objective(
            "6",
            section1,
            "",
            "",
            "I can vouch that he broke the glass ",
            "A. forcefully",
            "B. directly",
            "C. carefully",
            "D. deliberately",
            "D. verbosity",
            "accidentally ",
            "and not .....",
        )),


        Questions( objective = Objective(
            "7",
             section1,
            "",
            "",
            "Only question one is ",
            "A. easy",
            "B. clear",
            "C. confusing",
            "D. optional",
            "D. optional",
            "compulsory; ",
            "therefore, the rest are .....",
        )),


        Questions( objective = Objective(
            "8",
            section1,
            "",
            "",
            "The Magistrate ",
            "A. acquitted",
            "B. jailed",
            "C. released",
            "D. sentenced",
            "A. acquitted",
            "convicted ",
            "the hardened criminal but .....and discharged the first offender",
        )),


        Questions( objective = Objective(
            "9",
            section1,
            "",
            "",
            "Houses built with bricks are ",
            "A. temporary",
            "B. fragile",
            "C. beautiful",
            "D. cosy",
            "B. fragile",
            "sturdy ",
            "while those built with glass are .....",
        )),

        Questions( objective = Objective(
            "10",
             section1,
            "",
            "",
            "The principal is very ",
            "A. peaceful",
            "B. lenient",
            "C. kind",
            "D. efficient",
            "B. lenient",
            "strict ",
            "but his vice is .....",)),

        Questions( objective = Objective(
            "11",
            section2,
            "",
            "",
            "The brutal killing of members of the opposition provoked strong ......",
            "A. condemnation",
            "B. accusation",
            "C. molestation",
            "D. denial",
            "A. condemnation")),

        Questions( objective = Objective(
            "12",
             section2,
            "",
            "",
            "The doctor ....... my illness as malaria",
            "A. discovered",
            "B. diagnosed",
            "C. prescribed",
            "D. announced",
            "B. diagnosed")),


        Questions( objective = Objective(
            "13",
            section2,
            "",
            "",
            "Since we should not disclose our identity, our letter to the principal must be .....",
            "A. unclear",
            "B. anonymous",
            "C. ambiguous",
            "D. candid",
            "B. anonymous")),

        Questions( objective = Objective(
            "14",
            section2,
            "",
            "",
            "Although we pleaded for long with our father, he remained ....... that we should not go to the stadium.",
            "A. callous",
            "B. curious",
            "C. adamant",
            "D. candid",
            "C. adamant")),

        Questions( objective = Objective(
            "15",
            section2,
            "",
            "",
            "Since hard drugs are destroying our youths, our government has placed an ....... on them",
            "A. injunction",
            "B. infringement",
            "C. order",
            "D. embargo",
            "D. embargo")),


        Questions( objective = Objective(
            "16",
            section2,
            "",
            "",
            "Oseli's ....... teacher teaches English, Physics, Economics and Technical Drawing.",
            "A. efficient",
            "B. jovial",
            "C. kind",
            "D. versatile",
            "D. versatile")),


        Questions( objective = Objective(
            "17",
            section2,
            "",
            "",
            "Some political leaders love ....... who always praise their governments.",
            "A. sycophants",
            "B. parasites",
            "C. allies",
            "D. favourites",
            "A. sycophants")),


        Questions( objective = Objective(
            "18",
            section2,
            "",
            "",
            "The ....... of the new king will take place next week",
            "A. re-election",
            "B. demolition",
            "C. coronation",
            "D. re-admission",
            "C. coronation")),


        Questions( objective = Objective(
            "19",
            section2,
            "",
            "",
            "The match was a …………….. for Brazil because their team was stronger than the opposing team.",
            "A. profit",
            "B. giveaway",
            "C. walkover",
            "D. defeat",
            "C. walkover")),


        Questions( objective = Objective(
            "20",
            section2,
            "",
            "",
            "Kofi is too ....... ; he wants to know about everybody's business",
            "A. inquisitive",
            "B. friendly",
            "C. concerned",
            "D. busy",
            "A. inquisitive")),




        Questions( objective = Objective(
            "21",
            section3,
            "",
            "",
            "Ali does not let grass grow under his feet. This means that Ali",
            "A. does not waste time in doing things",
            "B. is very wicked",
            "C. cuts the grass in his field always",
            "D. is very selfish",
            "A. does not waste time in doing things",
        )),

        Questions( objective = Objective(
            "22",
            section3,
            "",
            "",
            "The dishonest trader always palms off faulty goods on her customers. This means that",
            "A. handles bad goods",
            "B. refunds money to her customers",
            "C. tricks her customers into accepting bad products",
            "D. pays the penalty for selling faulty goods",
            "C. tricks her customers into accepting bad products",
        )),

        Questions( objective = Objective(
            "23",
            section3,
            "",
            "",
            "Ojo's learning has gone to his head. This means that Ojo",
            "A. has become proud because of his learning",
            "B. has learnt too much",
            "C. has been made mad by his learning",
            "D. feels that only learning is important",
            "A. has become proud because of his learning",
        )),


        Questions( objective = Objective(
            "24",
            section3,
            "",
            "",
            "When the vice principal left the school, it became a bedlam. This means that",
            "A. every student attended school regularly",
            "B. punctuality was the order of the day",
            "C. many students boycotted classes",
            "D. there was noise and confusion in the school",
            "D. there was noise and confusion in the school",
        )),


        Questions( objective = Objective(
            "25",
            section3,
            "",
            "",
            "That amount Ivan donated was his widow's mite. This means that Ivan",
            "A. gave all that the widow had",
            "B. was miserly",
            "C. gave all that he had",
            "D. could have given more",
            "C. gave all that he had",
        )),


        Questions( objective = Objective(
            "26",
            section3,
            "",
            "",
            "Fatou's awkward behavior shows that she is a green horn. This means that Fatou is",
            "A. arrogant",
            "B. inexperienced",
            "C. inattentive",
            "D. cautious",
            "B. inexperienced",
        )),

        Questions( objective = Objective(
            "27",
            section3,
            "",
            "",
            "To secure more votes, the politician played to the gallery. This means that the politician",
            "A. became over confident",
            "B. attempted to win cheap popularity",
            "C. was selfish",
            "D. went to the gallery",
            "B. attempted to win cheap popularity",
        )),


        Questions( objective = Objective(
            "28",
            section3,
            "",
            "",
            "Those who think that all is well in Cascada are living in a fool's paradise . This means that",
            "A. they are fools",
            "B. some fools live in Cascadia",
            "C. they are under an illusion",
            "D. they are almost insane",
            "C. they are under an illusion",
        )),


        Questions( objective = Objective(
            "29",
            section3,
            "",
            "",
            "While playing a visit to his uncle, Ayo intends to kill two birds with one stone. This means that Ayo",
            "A. promises to bring two birds home",
            "B. takes part in a double deal",
            "C. hopes to achieve two aims with one action",
            "D. intends to do two things at the same time",
            "C. hopes to achieve two aims with one action",
        )),


        Questions( objective = Objective(
            "30",
            section3,
            "",
            "",
            "People hardly show their true colors. This means that people rarely show",
            "A. their abilities",
            "B. how colourful they can be",
            "C. their real character",
            "D. how noble they are",
            "C. their real character",
        )),


        Questions( objective = Objective(
            "31",
            section4,
            "",
            "",
            "Mary was kept in  ",
            "A. idle",
            "B. quiet",
            "C. lonely",
            "D. harsh",
            "C. lonely",
            "solitary ",
            "confinement.")),



        Questions( objective = Objective(
            "32",
            section4,
            "",
            "",
            "Buba has a very ",
            "A. attractive",
            "B. intricate",
            "C. deceptive",
            "D. interesting",
            "B. intricate",
            "alluring ",
            "personality.")),



        Questions( objective = Objective(
            "33",
            section4,
            "",
            "",
            "Hard drugs are  ",
            "A. paramount",
            "B. ineffective",
            "C. necessary",
            "D. harmful",
            "D. harmful",
            "detrimental  ",
            "to health.")),


        Questions( objective = Objective(
            "34",
            section4,
            "",
            "",
            "My father remains ",
            "A. certain",
            "B. relaxed",
            "C. permanent",
            "D. unyielding",
            "D. unyielding",
            "inflexible ",
            "once he has taken a decision.")),



        Questions( objective = Objective(
            "35",
            section4,
            "",
            "",
            "Maxwell usually makes  ",
            "A. prudent",
            "B. offensive",
            "C. unpredictable",
            "D. queer",
            "B. offensive",
            "obnoxious ",
            "remarks.")),



        Questions( objective = Objective(
            "36",
            section4,
            "",
            "",
            "We should ",
            "A. provoke",
            "B. persuade",
            "C. cajole",
            "D. force",
            "B. persuade",
            "prevail upon ",
            "Kwesi to accept the job")),



        Questions( objective = Objective(
            "37",
            section4,
            "",
            "",
            "The team has ",
            "A. a severe",
            "B. a heavy",
            "C. a strenuous",
            "D. an enjoyable",
            "C. a strenuous",
            "an arduous ",
            "task ahead of it.")),



        Questions( objective = Objective(
            "38",
            section4,
            "",
            "",
            "The two tasks should be undertaken ",
            "A. consecutively",
            "B. alternatively",
            "C. immediately",
            "D. simultaneously",
            "D. simultaneously",
            "concurrently")),


        Questions( objective = Objective(
            "39",
            section4,
            "",
            "",
            "The students were told to ",
            "A. re-examine",
            "B. recount",
            "C. inspect",
            "D. return",
            "A. re-examine",
            "review ",
            "their assignments.")),



        Questions( objective = Objective(
            "40",
            section4,
            "",
            "",
            "Marian does not have the  ",
            "A. courage",
            "B. energy",
            "C. determination",
            "D. ability",
            "B. energy",
            "stamina ",
            "to run that race.")),


        Questions( objective = Objective(
            "41",
            section5,
            "",
            "",
            "I want just ...... sugar in my tea.",
            "A. a few",
            "B. small",
            "C. little",
            "D. a little",
            "D. a little",
        )),


        Questions( objective = Objective(
            "42",
            section5,
            "",
            "",
            "Since the opposing parties could not come to an agreement, the peace talks .......",
            "A. broke up",
            "B. broke down",
            "C. broke through",
            "D. broke out",
            "D. broke out",
        )),

        Questions( objective = Objective(
            "43",
            section5,
            "",
            "",
            "Children often have implicit confidence ....... their parents.",
            "A. for",
            "B. on",
            "C. with",
            "D. in",
            "D. in",
        )),


        Questions( objective = Objective(
            "44",
            section5,
            "",
            "",
            "If i had heard the news earlier, I ...... stayed at home.",
            "A. would have",
            "B. will have",
            "C. will not have",
            "D. would have not",
            "A. would have",
        )),



        Questions( objective = Objective(
            "45",
            section5,
            "",
            "",
            "The order is that everyone must be ....... bed by midnight.",
            "A. on",
            "B. inside",
            "C. in",
            "D. within",
            "C. in",
        )),


        Questions( objective = Objective(
            "46",
            section5,
            "",
            "",
            "To succeed in any business, one must be prepared to shake ....... one's lazy habits.",
            "A. off",
            "B. over",
            "C. down",
            "D. of",
            "A. off",
        )),


        Questions( objective = Objective(
            "47",
            section5,
            "",
            "",
            "............. in his right senses will swallow live coals.",
            "A. Anyone",
            "B. No one",
            "C. Everyone",
            "D. Each one",
            "B. No one",
        )),


        Questions( objective = Objective(
            "48",
            section5,
            "",
            "",
            "One of the clever pupils ...........able to solve the problem.",
            "A. can",
            "B. was",
            "C. were",
            "D. are",
            "B. was"
        )),


        Questions( objective = Objective(
            "49",
            section5,
            "",
            "",
            "He has stopped being foolish .........?",
            "A. doesn't he",
            "B. does he",
            "C. hasn't he",
            "D. isn't it",
            "C. hasn't he",
        )),


        Questions( objective = Objective(
            "50",
            section5,
            "",
            "",
            "I maintain that the property in question is ......",
            "A. mine",
            "B. our",
            "C. my",
            "D. their",
            "A. mine",
        )),



        Questions( objective = Objective(
            "51",
            section5,
            "",
            "",
            "Although Sylvester and John promised to be here, ............ has turned up.",
            "A. both",
            "B. all",
            "C. neither",
            "D. either",
            "C. neither",
        )),


        Questions( objective = Objective(
            "52",
            section5,
            "",
            "",
            "The house ............ he lives is spacious.",
            "A. that",
            "B. where",
            "C. by which",
            "D. to which",
            "B. where",
        )),



        Questions( objective = Objective(
            "53",
            section5,
            "",
            "",
            "It is high time you ……....... this place.",
            "A. left",
            "B. leave",
            "C. had left",
            "D. have left",
            "A. left",
        )),


        Questions( objective = Objective(
            "54",
            section5,
            "",
            "",
            "Since you have lost your birth certificate, you have to go ............. an affidavit.",
            "A. for",
            "B. in",
            "C. on",
            "D. to",
            "A. for",
        )),


        Questions( objective = Objective(
            "55",
            section5,
            "",
            "",
            "The musicians have not arrived from Sierra Leone, ...........?",
            "A. had they",
            "B. hadn't they",
            "C. haven't they",
            "D. have they",
            "D. have they",
        )),


        Questions( objective = Objective(
            "56",
            section5,
            "",
            "",
            "On my way home, I saw a .........",
            "A. one-legged young mad man",
            "B. young one-legged mad man",
            "C. one-legged mad young man",
            "D. mad one-legged young man",
            "A. one-legged young mad man",
        )),


        Questions( objective = Objective(
            "57",
            section5,
            "",
            "",
            "People living in villages have a passion ...... animals.",
            "A. to",
            "B. with",
            "C. for",
            "D. of",
            "C. for",
        )),



        Questions( objective = Objective(
            "58",
            section5,
            "",
            "",
            "Kebba and Kwame are very selfish; they care about only ..........",
            "A. themselves",
            "B. one another",
            "C. each other",
            "D. himself",
            "A. themselves",
        )),


        Questions( objective = Objective(
            "59",
            section5,
            "",
            "",
            "You had better ………..... your assignment now.",
            "A. did",
            "B. done",
            "C. doing",
            "D. do",
            "D. do",
        )),


        Questions( objective = Objective(
            "60",
            section5,
            "",
            "",
            "Our kind teacher only cautioned the bully and let him..............",
            "A. off",
            "B. by",
            "C. over",
            "D. away",
            "A. off",
        )),


        Questions( objective = Objective(
            "61",
            section5,
            "",
            "",
            "My ………....house is on the next street",
            "A. father-in-law's",
            "B. father's-in-law",
            "C. fathers' in-law",
            "D. father-in-laws'",
            "A. father-in-law's",
        )),

        Questions( objective = Objective(
            "62",
            section5,
            "",
            "",
            "The Mathematics teacher made us commit the formula ……..... memory.",
            "A. on",
            "B. to",
            "C. into",
            "D. by",
            "B. to",
        )),


        Questions( objective = Objective(
            "63",
            section5,
            "",
            "",
            "Momodou has been ill .............three weeks now.",
            "A. since",
            "B. for",
            "C. through",
            "D. before",
            "C. through",
        )),


        Questions( objective = Objective(
            "64",
            section5,
            "",
            "",
            "They kept quiet all the ..............",
            "A. where",
            "B. period",
            "C. while",
            "D. interval",
            "B. period",
        )),


        Questions( objective = Objective(
            "65",
            section5,
            "",
            "",
            "............ caused the havoc, he sneaked off.",
            "A. On",
            "B. After",
            "C. Since",
            "D. Having",
            "D. Having",
        )),





        Questions( objective = Objective(
            "66",
            section5,
            "",
            "",
            "The point on ....... we disagreed was trivial.",
            "A. which",
            "B. whom",
            "C. what",
            "D. whose",
            "A. which",
        )),


        Questions( objective = Objective(
            "67",
            section5,
            "",
            "",
            "How did you arrive at ..... wonderful conclusion?",
            "A. a such",
            "B. that a",
            "C. that such",
            "D. such a",
            "D. such a",
        )),




        Questions( objective = Objective(
            "68",
            section5,
            "",
            "",
            "The government cannot ............ the decision any longer.",
            "A. put on",
            "B. put off",
            "C. put up",
            "D. put back",
            "C. put up",
        )),



        Questions( objective = Objective(
            "69",
            section5,
            "",
            "",
            "The teachers ………….... our poor performance in the examinations.",
            "A. are discussing on",
            "B. were discussing about",
            "C. had discussed on",
            "D. were discussing",
            "B. were discussing about",
        )),



        Questions( objective = Objective(
            "70",
            section5,
            "",
            "",
            "The wise thing to do is not to give ……….... to the temptation.",
            "A. in",
            "B. on",
            "C. for",
            "D. with",
            "A. in",
        )),




        Questions( objective = Objective(
            "71",
            section5,
            "",
            "",
            "My sister told me all .............. was said at the meeting.",
            "A. that",
            "B. what",
            "C. which",
            "D. who",
            "A. that",
        )),




        Questions( objective = Objective(
            "72",
            section5,
            "",
            "",
            "The quarrel between Olu and Ola will end up .....a fight.",
            "A. by",
            "B. in",
            "C. with",
            "D. among",
            "B. in",
        )),




        Questions( objective = Objective(
            "73",
            section5,
            "",
            "",
            "Musa did not want to fetch water for his grandfather ..............., his mother made him do it.",
            "A. even",
            "B. otherwise",
            "C. nevertheless",
            "D. moreover",
            "C. nevertheless",
        )),




        Questions( objective = Objective(
            "74",
            section5,
            "",
            "",
            "The citizens welcomed all the African ..........",
        "A. heads of states",
        "B. heads of state",
        "C. head of states",
        "D. head of state",
        "A. heads of states",
    )),



        Questions( objective = Objective(
        "75",
        section5,
        "",
        "",
        "Mother said she saw Alfred .............?",
        "A. did she",
        "B. she didn't",
        "C. she did",
        "D. didn't she",
        "D. didn't she",
        )),



        Questions( objective = Objective(
        "76",
        section6,
        "",
        "",
        passageA2013,
        "A. trading",
        "B. operations",
        "C. methods",
        "D. transactions",
        "B. operations",
        )),



            Questions( objective = Objective(
            "77",
            section6,
            "",
            "",
            passageA2013,
            "A. offer",
            "B. lottery",
            "C. action",
            "D. sale",
            "A. offer",
            )),


            Questions( objective = Objective(
            "78",
            section6,
            "",
            "",
            passageA2013,
            "A. traders",
            "B. clients",
            "C. brokers",
            "D. marketers",
            "C. brokers",
            )),


            Questions( objective = Objective(
            "79",
            section6,
            "",
            "",
            passageA2013,
            "A. warrant",
            "B. identification",
            "C. notice",
            "D. certificate",
            "D. certificate",
            )),


            Questions( objective = Objective(
            "80",
            section6,
            "",
            "",
            passageA2013,
            "A. dividend",
            "B. reward",
            "C. money",
            "D. payment",
            "A. dividend",
            )),




            Questions( objective = Objective(
            "81",
            section6,
            "",
            "",
            passageA2013,
            "A. buyers",
            "B. people",
            "C. creditors",
            "D. shareholders",
            "A. buyers",
            )),



            Questions( objective = Objective(
            "82",
            section6,
            "",
            "",
            passageA2013,
            "A. amount",
            "B. profit",
            "C. value",
            "D. units",
            "B. profit",
            )),


            Questions( objective = Objective(
            "83",
            section6,
            "",
            "",
            passageA2013,
            "A. items",
            "B. papers",
            "C. shares",
            "D. receipts",
            "C. shares",
            )),



            Questions( objective = Objective(
            "84",
            section6,
            "",
            "",
            passageA2013,
            "A. unsure",
            "B. independent",
            "C. elusive",
            "D. unstable",
            "D. unstable",
            )),


            Questions( objective = Objective(
            "85",
            section6,
            "",
            "",
            passageA2013,
            "A. falls",
            "B. crashes",
            "C. slips",
            "D. drops",
            "A. falls",
            )),


            Questions( objective = Objective(
            "86",
            section6,
            "",
            "",
            passageB2013,
            "A. tasks",
            "B. activities",
            "C. professions",
            "D. duties",
            "C. professions",
            )),

            Questions( objective = Objective(
            "87",
            section6,
            "",
            "",
            passageB2013,
            "A. societies",
            "B. clubs",
            "C. groups",
            "D. individuals",
            "C. groups",
            )),



            Questions( objective = Objective(
            "88",
            section6,
            "",
            "",
            passageB2013,
            "A. coerce",
            "B. motivate",
            "C. force",
            "D. allow",
            "B. motivate",
            )),




            Questions( objective = Objective(
            "89",
            section6,
            "",
            "",
            passageB2013,
            "A. attainment",
            "B. creation",
            "C. enforcement",
            "D. evolution",
            "A. attainment",
            )),


            Questions( objective = Objective(
            "90",
            section6,
            "",
            "",
            passageB2013,
            "A. secret",
            "B. outing",
            "C. naming",
            "D. initiation",
            "D. initiation",
            )),



            Questions( objective = Objective(
            "91",
            section6,
            "",
            "",
            passageB2013,
            "A. formal",
            "B. special",
            "C. exclusive",
            "D. privileged",
            "B. special",
            )),



            Questions( objective = Objective(
            "92",
            section6,
            "",
            "",
            passageB2013,
            "A. diet",
            "B. dishes",
            "C. menu",
            "D. meal",
            "D. meal",
            )),


            Questions( objective = Objective(
            "93",
            section6,
            "",
            "",
            passageB2013,
            "A. friendly",
            "B. school",
            "C. peer",
            "D. sex",
            "C. peer",
            )),



            Questions( objective = Objective(
            "94",
            section6,
            "",
            "",
            passageB2013,
            "A. fixed",
            "B. formed",
            "C. organized",
            "D. shaped",
            "C. organized",
            )),



            Questions( objective = Objective(
            "95",
            section6,
            "",
            "",
            passageB2013,
            "A. hierarchy",
            "B. step",
            "C. method",
            "D. prefects",
            "A. hierarchy",
            )),



            Questions( objective = Objective(
            "96",
            section6,
            "",
            "",
            passageB2013,
            "A. supervisors",
            "B. officers",
            "C. pupils",
            "D. prefects",
            "D. prefects",
            )),



            Questions( objective = Objective(
            "97",
            section6,
            "",
            "",
            passageB2013,
            "A. timetable",
            "B. set-up",
            "C. curriculum",
            "D. calendar",
            "A. timetable",
            )),



            Questions( objective = Objective(
            "98",
            section6,
            "",
            "",
            passageB2013,
            "A. reviewing",
            "B. shaping",
            "C. creating",
            "D. repairing",
            "B. shaping",
            )),


            Questions( objective = Objective(
            "99",
            section6,
            "",
            "",
            passageB2013,
            "A. behaviour",
            "B. success",
            "C. learning",
            "D. objective",
            "A. behaviour",

            )),




        Questions( objective = Objective(
        "100",
        section6,
        "",
        "",
        passageB2013,
        "A. home",
        "B. area",
        "C. place",
        "D. society",
        "D. society",
        )),






    )

    val englishYear = listOf<List<Questions>>(
        english2013
    )
}