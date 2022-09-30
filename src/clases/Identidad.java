/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author amgon
 */
public final class Identidad {
    
    /*
       codigos de retorno del servicio rest
    */
    public final static String OK = "000";
    public final static String REGISTRO_EXITO = "001";
    public final static String REGISTRO_ERROR = "002";
    public final static String CLIENTE_EXITO = "003";
    public final static String CLIENTE_NO_EXISTE = "004";
    public final static String CLIENTE_VENCIDO = "005";
    public final static String CLIENTE_PRONTO_VENCE = "006";
    public final static String CLIENTE_ESPERA = "007";
    public final static String CLIENTE_SIN_REGISTRO = "008";
    public final static String CLIENTE_ACTIVADO = "009";
    public final static String CLIENTE_YA_ESTA_ACTIVADO = "010";
    public final static String PUNTO_NO_EXISTE = "011";
    
    /*
      Hace referencia a la consulta getDatosMaestra 
    */
    public final static int l1 = 0;
    public final static int l2 = 1;
    public final static int l4 = 2;
    public final static int c1 = 3;
    public final static int c2 = 4;
    public final static int c3 = 5;
    public final static int c4 = 6;
    public final static int c5 = 7;
    public final static int d1 = 8;
    public final static int d2 = 9;
    public final static int d3 = 10;
    public final static int d4 = 11;
    public final static int d5 = 12;
    public final static int d6 = 13;
    public final static int d7 = 14;
    public final static int pie = 15;
    public final static int legal = 16;
    public final static int c6 = 17;
    public final static int c7 = 18;
    public final static int recogida = 19;
    public final static int lector = 20;
    public final static int tituloFactura = 21;
    public final static int pvpSinIva = 22;
    public final static int costoSinIva = 23;
    public final static int ventasPredeterminado = 24;
    public final static int mensajeUtilidad = 25;
    public final static int consecutivosDiferentes = 26;
    public final static int resolucionIgual = 27;
    public final static int diasAlertaResolucion = 28;
    public final static int alertaFechaDias = 29;
    public final static int alertaCantidadNumeracion = 30;
    public final static int alertaPromedioDias = 31;
    public final static int diasCobroMora = 32;
    public final static int porcentajeMora = 33;
    public final static int generaOrdenMedica = 34;
    public final static int imprimirOrdenMedica = 35;
    public final static int imprimirFacturaOrdenMedica = 36;
    public final static int horaInicioAgenda = 37;
    public final static int horaFinAgenda = 38;
    public final static int intervaloAgenda = 39;
    public final static int codPrestadorServicio = 40;
    public final static int imprimirCuadreFiscal = 41;
    public final static int ocultarInformacionCliente = 42;
    public final static int visualizarTodasLasFacturas = 43;
    public final static int mostrarInformacionCuadre = 44;
    public final static int descuentoMaximoVentas = 45;
    public final static int tipoIdPrestadorServicio = 46;
    public final static int otros = 47;
    public final static int domicilios = 48;
    public final static int limite = 49;
    public final static int combinarProductos = 50;
    public final static int modificarNombre = 51;
    public final static int impBolsa = 52;
    public final static int valorBolsa = 53;
    public final static int turno = 54;
    public final static int turno1 = 55;
    public final static int anexoFacturacion = 56;
    public final static int consecutivo = 57;
    public final static int hora = 58;
    public final static int pondNegativo = 59;
    public final static int anexoOrdenServicio = 60;
    public final static int modificarPrecio = 61;
    public final static int borrarCongelada = 62;
    public final static int copiasFactura = 63;
    public final static int copiasOServicio = 64;
    public final static int copiasCotizacion = 65;
    public final static int copiasPlanSepare = 66;
    public final static int copiasPedido = 67;
    public final static int previsualizarFactura = 68;
    public final static int previsualizarOServicio = 69;
    public final static int previsualizarCotizacion = 70;
    public final static int previsualizarPlanSepare = 71;
    public final static int previsualizarPedido = 72;
    public final static int numFactura = 73;
    public final static int numOServicio = 74;
    public final static int numCotizacion = 75;
    public final static int numPlanSepare = 76;
    public final static int numPedido = 77;
    public final static int pagoTerceros = 78;
    public final static int facturarSinInventario = 79;
    public final static int reimpresion = 80;
    public final static int impresoraPos = 81;
    public final static int impresoraMediaCarta = 82;
    public final static int impresoraCarta = 83;
    public final static int verImpoconsumo = 84;
    public final static int verRetenciones = 85;
    public final static int imprimirCada = 86;
    public final static int cantidadEstablecida = 87;
    public final static int filas = 88;
    public final static int columnas = 89;
    public final static int porcPropina = 90;
    public final static int mostrarDevuelta = 91;
    public final static int inicioHosp = 92;
    public final static int finHosp = 93;
    public final static int intervalosHosp = 94;
    public final static int diasAutomaticos = 95;
    public final static int ciudadBuscador = 96;
    public final static int foco = 97;
    public final static int pvpImpoconsumo = 98;
    public final static int costoImpoconsumo = 99;
    public final static int impresionPorGrupo = 100;
    public final static int copiasComanda = 101;
    public final static int copiasPrefactura = 102;
    public final static int previsualizarComanda = 103;
    public final static int previsualizarPrefactura = 104;
    public final static int impresoraComanda = 105;
    public final static int impresoraPrefactura = 106;
    public final static int meserosFacturarMesas = 107;
    public final static int soloMesas = 108;
    public final static int borrarMesas = 109;
    public final static int idUsuario = 110;
    public final static int password = 111;
    public final static int numFacturaIncremento = 112;
    public final static int responsabilidades = 113;
    public final static int gmail = 114;
    public final static int passGmail = 115;
    /*
      fin de variables getDatosMaestra 
    */
    
    /*
      Hace referencia a los datos de la tabla Model tblProductos
    */
    public final static int Codigo = 0 ;
    public final static int Descripción = 1 ;
    public final static int ValorUnit = 2 ;
    public final static int Cant = 3 ;
    public final static int Subtotal = 4 ;
    public final static int DescPorc = 5 ;
    public final static int Desc = 6 ;
    public final static int IvaPorc = 7 ;
    public final static int Impo = 8 ;
    public final static int Total = 9 ;
    public final static int Ubicación = 10 ;
    public final static int Referencia = 11 ;
    public final static int plu = 12 ;
    public final static int cant2 = 13 ;
    public final static int ponderado = 14 ;
    public final static int Utilidad = 15 ;
    public final static int Estado = 16 ;
    public final static int Copago = 17 ;
    public final static int datoGrupo = 18 ;
    public final static int PagoTercero = 19 ;
    public final static int Utilidad1 = 20 ;
    public final static int OrdenAviso = 21 ;
    public final static int Borrar = 22 ;
    public final static int ImpoPorc = 23 ;
    public final static int Orden = 24 ;
    public final static int Aviso = 25 ;
    public final static int FEntrega = 26 ;
    public final static int Detalle = 27 ;
    public final static int Lote = 28 ;
    public final static int IdProd = 29 ;
    public final static int paraComanda = 30 ;
    public final static int permisoDesc = 31 ;
    public final static int idSistema = 32 ;
    public final static int Iva = 33 ;
    public final static int Grupo = 34 ;
    public final static int Estandar = 35 ;
    public final static int Medida = 36 ;
    public final static int ControlInv = 37 ;
    public final static int Idbdcongelada = 38 ;

}
