# Sistema de Gestão Agenda Telefônica

```mermaid
classDiagram
    
    direction LR
    
    class App {
        
    }    
    
    class Agenda {
                
    }
    
    class Contato {
        
    }
    class Email {
        
    }
    class Telefone{
        
    }
    
    App"1" *-- "1"Agenda
    Agenda"1" *-- "0..*"Contato
    Contato"1" *-- "0..*"Telefone
    Contato"1" *-- "0..*"Email


```