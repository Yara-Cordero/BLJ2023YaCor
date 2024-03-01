## Test Cases 

| Input                       | Dreieckstyp                  | erwarteter Code | erhaltener Code |
|-----------------------------|------------------------------|-----------------|-----------------|
| A: 2.1 / B: 2.1 / C: 3      | Gleichschenkliges Dreieck    | TRI84TF         | TRI84TF         |
| A: 5.03 / B: 5.03 / C: 5.03 | Gleichseitiges Dreieck       | TRI66TF         | TRI66TF         |
| A: 4 / B: 5 / C: 7          | Gewöhnliches Dreieck         | TRI60TF         | TRI60TF         |
| A: 3 / B: 4 / C: 5          | Rechtwinkliges Dreieck       | TRI72TF         | TRI72TF         | 
| A: 4 / B: 3 / C: 9          | Unmögliches Dreieck          | ERR36TF         | ERR36TF         |
| A: @ / B: b / C: £          | Buchstaben oder sonstige Zeichen | ERR96TF     | ERR96TF         |
| A: -5 / B: 7 / C: 6         | Minuszahlen                  | ERR12TF         | ERR12TF         | 
| A: 0 / B: 5 / C: 7          | Null als Seitenlänge         | ERR16TF         | ERR16TF         |
| A: 5 / B: 5 / C: 10         | Eine Gerade                  | ERR56TF         | ERR56TF         | 
