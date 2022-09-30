	$('#saldoCierreManual').on('keyup', function() {
	      formatCurrency($(this));
		 var cierreManual = document.getElementById('saldoCierreManual').value;
         var movimientosAnterior = document.getElementById('saldoMovimientosAnterior').value;
             cierreManual = cierreManual.replaceAll('.', '');
             movimientosAnterior = movimientosAnterior.replaceAll('.', '');

		 if (parseFloat(cierreManual) == 0 || isNaN(parseFloat(movimientosAnterior)) || isNaN(parseFloat(cierreManual))) {
	        // valida que el cierre no llegue vacio, al dar click lo reconoce como numero
	     
			if(cierreManual == "") {
			    jQuery('#diferencia').removeClass('border border-danger');
				jQuery('#diferencia').removeClass('border border-warning');
				jQuery('#diferencia').addClass('border border-success');

				//Se muestran los mensajes en el formulario
				jQuery('#noNumero').removeClass('noVisible');
				jQuery('#noNumero').addClass('visible');
				jQuery('#exacto').removeClass('Visible');
				jQuery('#exacto').addClass('noVisible');
				jQuery('#menorCero').removeClass('visible');
				jQuery('#menorCero').addClass('noVisible');
				jQuery('#mayorCero').removeClass('visible');
				jQuery('#mayorCero').addClass('noVisible');
			    return;
			}
			
			 document.getElementById('diferencia').value = 0.0;
			if (document.getElementById('diferencia').value == 0  && cierreManual == 0 && movimientosAnterior==0 && !isNaN(cierreManual)) {
		    	jQuery('#diferencia').removeClass('border border-danger');
				jQuery('#diferencia').removeClass('border border-warning');
				jQuery('#diferencia').addClass('border border-success');

				//Se muestran los mensajes en el formulario
				jQuery('#exacto').removeClass('noVisible');
				jQuery('#exacto').addClass('visible');
				jQuery('#menorCero').removeClass('visible');
				jQuery('#menorCero').addClass('noVisible');
				jQuery('#mayorCero').removeClass('visible');
				jQuery('#mayorCero').addClass('noVisible');
				jQuery('#noNumero').removeClass('visible');
				jQuery('#noNumero').addClass('noVisible');
			}
			
		} else {
			document.getElementById('diferencia').value = parseFloat(cierreManual) - parseFloat(movimientosAnterior);

			if (document.getElementById('diferencia').value == 0) {
				jQuery('#diferencia').removeClass('border border-danger');
				jQuery('#diferencia').removeClass('border border-warning');
				jQuery('#diferencia').addClass('border border-success');

				//Se muestran los mensajes en el formuilario
				jQuery('#exacto').removeClass('noVisible');
				jQuery('#exacto').addClass('visible');
				jQuery('#menorCero').removeClass('visible');
				jQuery('#menorCero').addClass('noVisible');
				jQuery('#mayorCero').removeClass('visible');
				jQuery('#mayorCero').addClass('noVisible');
				jQuery('#noNumero').removeClass('visible');
				jQuery('#noNumero').addClass('noVisible');

				//-----------------------------------------
			}
			if (document.getElementById('diferencia').value < 0) {
				jQuery('#diferencia').removeClass('border border-success');
				jQuery('#diferencia').removeClass('border border-warning');
				jQuery('#diferencia').addClass('border border-danger');

				//Se muestran los mensajes en el formuilario
				jQuery('#menorCero').removeClass('noVisible');
				jQuery('#menorCero').addClass('visible');
				jQuery('#exacto').removeClass('visible');
				jQuery('#exacto').addClass('noVisible');
				jQuery('#mayorCero').removeClass('visible');
				jQuery('#mayorCero').addClass('noVisible');
				jQuery('#noNumero').removeClass('visible');
				jQuery('#noNumero').addClass('noVisible');
			}
			if (document.getElementById('diferencia').value > 0) {
				jQuery('#diferencia').removeClass('border border-success');
				jQuery('#diferencia').removeClass('border border-danger');
				jQuery('#diferencia').addClass('border border-warning');

				//Se muestran los mensajes en el formuilario
				jQuery('#mayorCero').removeClass('noVisible');
				jQuery('#mayorCero').addClass('visible');
				jQuery('#exacto').removeClass('visible');
				jQuery('#exacto').addClass('noVisible');
				jQuery('#menorCero').removeClass('visible');
				jQuery('#menorCero').addClass('noVisible');
				jQuery('#noNumero').removeClass('visible');
				jQuery('#noNumero').addClass('noVisible');
			}
		}
	},
	    'blur', function() { 
	      formatCurrency($(this), "blur");
	    });
        