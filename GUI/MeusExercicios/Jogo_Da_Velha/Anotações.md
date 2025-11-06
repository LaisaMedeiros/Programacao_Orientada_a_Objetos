JFRAME (BoxLayout - Vertical)
├── Título
├── Botão Seleção  
└── PAINEL (GridLayout 3x3)
    ├── Botão [0,0] ── Botão [0,1] ── Botão [0,2]
    ├── Botão [1,0] ── Botão [1,1] ── Botão [1,2]
    └── Botão [2,0] ── Botão [2,1] ── Botão [2,2]

BoxLayout → Organiza entre os painéis (vertical/horizontal), ele tenta esticar os componentes para preecnher todo espaço possível
GridLayout → Organiza dentro de cada painel (grade)
JPanel → É um "container" que pode ter seu próprio layout

Cada painel pode ter um layout diferente! Isso dá flexibilidade total.