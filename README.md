# Evaluation-18-12-2024

## Description
L'application **Evaluation-18-12-2024** est une application mobile conçue en **Kotlin** avec Jetpack Compose. Elle permet d'afficher une liste de personnages fictifs, de consulter leurs détails, et propose une navigation fluide entre les écrans grâce à une architecture bien structurée.

## Fonctionnalités
- Affichage d'une **liste de personnages** avec leurs informations de base (nom, statut, espèce).
- Consultation des **détails d'un personnage** spécifique.
- **Effets sonores** et vibrations lors de l'interaction avec un personnage.
- Navigation intuitive grâce à un système de **graphique de navigation**.
- Prise en charge des **langues Français et Anglais**.

## Structure du Projet
Le projet est organisé selon une architecture modulaire qui sépare clairement les responsabilités :

### **Data**
Contient les sources de données et les dépôts pour accéder aux données :
- `datasources`: Simule une source de données locale (`CharacterLocal`).
- `repositories`: Fournit des méthodes pour récupérer des données (`CharacterRepository`).

### **Domain**
Définit les modèles et interfaces :
- `models`: Définit le modèle `Character`.
- `repositories`: Contient l'interface `ICharacterRepository`.

### **UI**
Gère les éléments d'interface utilisateur :
- `screens/CharacterList`: Contient les composables et le ViewModel pour afficher la liste des personnages.
- `screens/CharacterListDetail`: Contient les composables et le ViewModel pour afficher les détails d'un personnage.
- `theme`: Gère les thèmes et styles de l'application.

### **Navigation**
- `AppNavGraph`: Gère les routes et la navigation entre les écrans.

### **Ressources**
- **Strings** : Définitions en français et en anglais dans des fichiers XML.
- **Sons** : Intègre un effet sonore lors de l'interaction avec un personnage.

## Pré-requis
Pour exécuter ce projet, vous devez avoir :
- **Android Studio** installé (version Arctic Fox ou supérieure recommandée).
- **JDK 11** ou une version compatible.
- Un appareil ou un émulateur Android avec une version API minimale de 21.

## Installation
1. Clonez ce dépôt :
   ```bash

📦 com.example.evaluation_18_12_2024
├── 📂 data
│   ├── 📂 datasources
│   │   └── CharacterLocal.kt  
│   ├── 📂 repositories
│   │   └── CharacterRepository.kt  
├── 📂 domain
│   ├── 📂 models
│   │   └── Character.kt  
│   ├── 📂 repositories
│   │   └── ICharacterRepository.kt  
├── 📂 navigation
│   └── AppNavGraph.kt  
├── 📂 ui
│   ├── 📂 screens
│   │   ├── 📂 CharacterList
│   │   │   ├── CharacterListScreen.kt  
│   │   │   ├── CharacterListViewModel.kt  
│   │   ├── 📂 CharacterListDetail
│   │   │   ├── CharacterListDetailScreen.kt  
│   │   │   ├── CharacterListDetailViewModel.kt  
├── 📂 res
│   ├── values
│   │   ├── strings.xml  
│   │   ├── strings-fr.xml  

   git clone https://github.com/votre-repo/evaluation-18-12-2024.git
