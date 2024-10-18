package PackagePrueba;

public class JFramePrueba extends javax.swing.JFrame {

    public JFramePrueba() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        textoPrincipal = new javax.swing.JLabel();
        botonResultado = new javax.swing.JPanel();
        textoResultado = new javax.swing.JLabel();
        botonMensaje = new javax.swing.JPanel();
        textoMensaje = new javax.swing.JLabel();
        panelCalculadora = new javax.swing.JPanel();
        panelPantalla = new javax.swing.JPanel();
        textoPantalla = new javax.swing.JLabel();
        botonCero = new javax.swing.JLabel();
        botonUno = new javax.swing.JLabel();
        botonDos = new javax.swing.JLabel();
        botonTres = new javax.swing.JLabel();
        botonCuatro = new javax.swing.JLabel();
        botonCinco = new javax.swing.JLabel();
        botonSeis = new javax.swing.JLabel();
        botonSiete = new javax.swing.JLabel();
        botonOcho = new javax.swing.JLabel();
        botonNueve = new javax.swing.JLabel();
        botonPunto = new javax.swing.JLabel();
        botonSuma = new javax.swing.JLabel();
        botonResta = new javax.swing.JLabel();
        botonMultiplicacion = new javax.swing.JLabel();
        botonDivision = new javax.swing.JLabel();
        barraWindows = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JLabel();
        panelSalida = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBotones.setBackground(new java.awt.Color(51, 153, 255));

        textoPrincipal.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        textoPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        textoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPrincipal.setText("Calculadora Prueba Prácticas");

        botonResultado.setBackground(new java.awt.Color(255, 255, 255));
        botonResultado.setForeground(new java.awt.Color(255, 255, 255));
        botonResultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoResultado.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        textoResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoResultado.setText("Mostrar Resultado");
        textoResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textoResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoResultadoMouseClicked(evt);
            }
        });
        botonResultado.add(textoResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        botonMensaje.setBackground(new java.awt.Color(255, 255, 255));
        botonMensaje.setForeground(new java.awt.Color(255, 255, 255));
        botonMensaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoMensaje.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        textoMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoMensaje.setText("Mostrar Mensaje");
        textoMensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMensaje.add(textoMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        panelCalculadora.setBackground(new java.awt.Color(255, 255, 255));

        panelPantalla.setBackground(new java.awt.Color(204, 204, 204));

        textoPantalla.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        textoPantalla.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPantallaLayout = new javax.swing.GroupLayout(panelPantalla);
        panelPantalla.setLayout(panelPantallaLayout);
        panelPantallaLayout.setHorizontalGroup(
            panelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPantallaLayout.setVerticalGroup(
            panelPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        botonCero.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonCero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonCero.setText("0");
        botonCero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonCero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCeroMouseClicked(evt);
            }
        });

        botonUno.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonUno.setText("1");
        botonUno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonUnoMouseClicked(evt);
            }
        });

        botonDos.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonDos.setText("2");
        botonDos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonDos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDosMouseClicked(evt);
            }
        });

        botonTres.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonTres.setText("3");
        botonTres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonTres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTresMouseClicked(evt);
            }
        });

        botonCuatro.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonCuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonCuatro.setText("4");
        botonCuatro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonCuatro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCuatroMouseClicked(evt);
            }
        });

        botonCinco.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonCinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonCinco.setText("5");
        botonCinco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonCinco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCincoMouseClicked(evt);
            }
        });

        botonSeis.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonSeis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSeis.setText("6");
        botonSeis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonSeis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeisMouseClicked(evt);
            }
        });

        botonSiete.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonSiete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSiete.setText("7");
        botonSiete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonSiete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSieteMouseClicked(evt);
            }
        });

        botonOcho.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonOcho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonOcho.setText("8");
        botonOcho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonOcho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonOcho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonOchoMouseClicked(evt);
            }
        });

        botonNueve.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonNueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonNueve.setText("9");
        botonNueve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonNueve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNueveMouseClicked(evt);
            }
        });

        botonPunto.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonPunto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonPunto.setText(".");
        botonPunto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonPunto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPuntoMouseClicked(evt);
            }
        });

        botonSuma.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonSuma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSuma.setText("+");
        botonSuma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonSuma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSumaMouseClicked(evt);
            }
        });

        botonResta.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonResta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonResta.setText("-");
        botonResta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonResta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRestaMouseClicked(evt);
            }
        });

        botonMultiplicacion.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonMultiplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonMultiplicacion.setText("x");
        botonMultiplicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonMultiplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMultiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMultiplicacionMouseClicked(evt);
            }
        });

        botonDivision.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        botonDivision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonDivision.setText("/");
        botonDivision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        botonDivision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDivisionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCalculadoraLayout = new javax.swing.GroupLayout(panelCalculadora);
        panelCalculadora.setLayout(panelCalculadoraLayout);
        panelCalculadoraLayout.setHorizontalGroup(
            panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addComponent(botonSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addComponent(botonCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addComponent(botonUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculadoraLayout.createSequentialGroup()
                        .addComponent(botonCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCalculadoraLayout.setVerticalGroup(
            panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculadoraLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(panelPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBotonesLayout.createSequentialGroup()
                                .addComponent(botonResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(textoPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(textoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(panelCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelPrincipal.add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 650));

        barraWindows.setBackground(new java.awt.Color(255, 255, 255));

        botonCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonCerrar.setText("X");

        javax.swing.GroupLayout barraWindowsLayout = new javax.swing.GroupLayout(barraWindows);
        barraWindows.setLayout(barraWindowsLayout);
        barraWindowsLayout.setHorizontalGroup(
            barraWindowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraWindowsLayout.createSequentialGroup()
                .addGap(0, 1090, Short.MAX_VALUE)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraWindowsLayout.setVerticalGroup(
            barraWindowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        panelPrincipal.add(barraWindows, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 20));

        panelSalida.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelSalidaLayout = new javax.swing.GroupLayout(panelSalida);
        panelSalida.setLayout(panelSalidaLayout);
        panelSalidaLayout.setHorizontalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelSalidaLayout.setVerticalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 760, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String textoEnPantalla = "";
    
    private void textoResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoResultadoMouseClicked
        
    }//GEN-LAST:event_textoResultadoMouseClicked

    private void botonCeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCeroMouseClicked
        botonCeroMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonCeroMouseClicked

    private void botonUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonUnoMouseClicked
        botonUnoMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonUnoMouseClicked

    private void botonDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDosMouseClicked
        botonDosMouseClickedReturn();
        mostrarTextoPantalla();    }//GEN-LAST:event_botonDosMouseClicked

    private void botonTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTresMouseClicked
        botonTresMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonTresMouseClicked

    private void botonCuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuatroMouseClicked
        botonCuatroMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonCuatroMouseClicked

    private void botonCincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCincoMouseClicked
        botonCincoMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonCincoMouseClicked

    private void botonSeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeisMouseClicked
        botonSeisMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonSeisMouseClicked

    private void botonSieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSieteMouseClicked
        botonSieteMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonSieteMouseClicked

    private void botonOchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOchoMouseClicked
        botonOchoMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonOchoMouseClicked

    private void botonNueveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNueveMouseClicked
        botonNueveMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonNueveMouseClicked

    private void botonPuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPuntoMouseClicked
        botonPuntoMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonPuntoMouseClicked

    private void botonSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSumaMouseClicked
        botonSumaMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonSumaMouseClicked

    private void botonRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRestaMouseClicked
        botonRestaMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonRestaMouseClicked

    private void botonMultiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMultiplicacionMouseClicked
        botonMultiplicacionMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonMultiplicacionMouseClicked

    private void botonDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDivisionMouseClicked
        botonDivisionMouseClickedReturn();
        mostrarTextoPantalla();
    }//GEN-LAST:event_botonDivisionMouseClicked
    
    private String botonCeroMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "0";        
        return textoEnPantalla;
    }        
    
    private String botonUnoMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "1";        
        return textoEnPantalla;
    }
    
    private String botonDosMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "2";        
        return textoEnPantalla;
    }
    
    private String botonTresMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "3";        
        return textoEnPantalla;
    }
    
    private String botonCuatroMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "4";        
        return textoEnPantalla;
    }
    
    private String botonCincoMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "5";        
        return textoEnPantalla;
    }
    
    private String botonSeisMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "6";        
        return textoEnPantalla;
    }
    
    private String botonSieteMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "7";        
        return textoEnPantalla;
    }
    
    private String botonOchoMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "8";        
        return textoEnPantalla;
    }
    
    private String botonNueveMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "9";        
        return textoEnPantalla;
    }
    
    private String botonPuntoMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + ".";        
        return textoEnPantalla;
    }
    
    private String botonSumaMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "+";        
        return textoEnPantalla;
    }
    
    private String botonRestaMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "-";        
        return textoEnPantalla;
    }
    
    private String botonMultiplicacionMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "x";        
        return textoEnPantalla;
    }
    
    private String botonDivisionMouseClickedReturn() {
        textoEnPantalla = textoEnPantalla + "/";        
        return textoEnPantalla;
    }
    
    public void mostrarTextoPantalla() {
        textoPantalla.setText(textoEnPantalla);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrueba().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraWindows;
    private javax.swing.JLabel botonCero;
    private javax.swing.JPanel botonCero2;
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JLabel botonCinco;
    private javax.swing.JLabel botonCuatro;
    private javax.swing.JLabel botonDivision;
    private javax.swing.JLabel botonDos;
    private javax.swing.JPanel botonMensaje;
    private javax.swing.JLabel botonMultiplicacion;
    private javax.swing.JLabel botonNueve;
    private javax.swing.JLabel botonOcho;
    private javax.swing.JLabel botonPunto;
    private javax.swing.JLabel botonResta;
    private javax.swing.JPanel botonResultado;
    private javax.swing.JLabel botonSeis;
    private javax.swing.JLabel botonSiete;
    private javax.swing.JLabel botonSuma;
    private javax.swing.JLabel botonTres;
    private javax.swing.JLabel botonUno;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCalculadora;
    private javax.swing.JPanel panelPantalla;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSalida;
    private javax.swing.JLabel textoMensaje;
    private javax.swing.JLabel textoPantalla;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JLabel textoResultado;
    // End of variables declaration//GEN-END:variables
}
