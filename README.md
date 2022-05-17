# Projekt č. 1 - Sazby DPH

Projekt č. 1 - Sazby DPH
Zadání
------
Naprogramuj aplikaci v Javě, která vypíše všechny státy Evropské unie, které mají sazbu daně z přidané hodnoty (DPH, VAT) vyšší, než 20 % a nepoužívají speciální sazbu DPH/VAT.

Výstup aplikace
---------------
Postupně zpracuj tyto kroky:

- Načti ze souboru všechna data do vhodné datové struktury (vytvoř třídu pro uložení dat).
- Vypiš seznam všech států a u každého uveď základní sazbu daně z přidané hodnoty ve formátu podle vzoru:

        Název země (zkratka): základní sazba %
        Například:

        Austria (AT): 20 %
        Belgium (BE): 21 %
        ...
- Vypište ve stejném formátu pouze státy, které mají základní sazbu daně z přidané hodnoty vyšší než 20 % a přitom nepoužívají speciální sazbu daně.

- Výpis z bodu 3. seřaď podle výše základní sazby DPH/VAT sestupně (nejprve státy s nejvyšší sazbou).

- Pod výpis z bodu 3. doplň řádek s rovnítky pro oddělení a poté seznam zkratek států, které ve výpisu nefigurují. Opět dodrž formát podle vzoru (místo tří teček budou další státy):

      Sweden (SE):    25 % (12 %)
      Croatia (HR):   25 % (13 %)
      ...
      Finland (FI):   24 % (14 %)
      ...

- Sazba VAT 20 % nebo nižší nebo používají speciální sazbu: AT, CY, CZ,... 
- Výsledný výpis zapiš také do souboru s názvem vat-over-20.txt. Výstupní soubor ulož do stejné složky, ve které byl vstupní soubor. (Výpis na obrazovku zůstává.)

- Doplň možnost, aby uživatel z klávesnice zadal výši sazby DPH/VAT, podle které se má filtrovat. Vypíší se tedy státy se základní sazbou vyšší než ta, kterou uživatel zadal.

- Pokud uživatel zmáčkne pouze Enter, jako výchozí hodnota se použij jako výchozí sazbu 20 %.
- Uprav název výstupního souboru tak, aby reflektoval zadanou sazbu daně. Například pro zadanou sazbu 17 % se vygeneruje soubor vat-over-17.txt a pro sazbu 25 % se vygeneruje soubor vat-over-25.txt.


# Projekt č. 1 - Sazby DPH
Zadání
------
Podobně jako v u prvního projektu budeme pracovat s daňovými sazbami, ale tentokrát nebudeme data získávat přímo ze souboru, ale zde: https://euvatrates.com/rates.json a nepůjde o parsování obyčejného textového souboru, ale data budou ve formátu JSON.

Výstup aplikace
---------------
Úkolem bude data načíst, rozparsovat, uložit, vyhledat 3 země s nejvyššími sazbami a 3 země s nejnižšími sazbami a vypsat je.
- Zavolat API pomocí HTTP
-  Načíst JSON soubor
- Naparsovat JSON soubor do objektu
- Implementovat vyhledávací logiku
- Vypsat hodnoty pomocí interaktivní příkazové řádky
- Umožnit zapsat výsledek do souboru
