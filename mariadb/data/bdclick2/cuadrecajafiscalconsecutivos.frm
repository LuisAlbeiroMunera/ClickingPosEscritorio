TYPE=VIEW
query=select cast(substr(`bdclick2`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick2`.`bdcuadre`.`Id` AS `Id`,`bdclick2`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick2`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick2`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick2`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick2`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick2`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick2`.`bdcuadre` left join `bdclick2`.`primeroultimonc` on((`bdclick2`.`bdcuadre`.`Id` = `bdclick2`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick2`.`bdcuadre`.`Id`,8,100) as signed),`bdclick2`.`bdcuadre`.`Id`,`bdclick2`.`primeroultimonc`.`primeroNc`,`bdclick2`.`primeroultimonc`.`ultimoNc`,`bdclick2`.`bdcuadre`.`primeraFactura`,`bdclick2`.`bdcuadre`.`ultimaFactura`,`bdclick2`.`bdcuadre`.`primerAbono`,`bdclick2`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick2`.`bdcuadre`.`Id`,8,100) as signed)
md5=36ce93bc7b9aae63f7c92a01e76593a0
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,`primeroultimonc`.`primeroNc` AS `primeroNc`,`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdcuadre`.`primerAbono` AS `primerAbono`,`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdcuadre` left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,`primeroultimonc`.`primeroNc`,`primeroultimonc`.`ultimoNc`,`bdcuadre`.`primeraFactura`,`bdcuadre`.`ultimaFactura`,`bdcuadre`.`primerAbono`,`bdcuadre`.`ultimoAbono` order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick2`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick2`.`bdcuadre`.`Id` AS `Id`,`bdclick2`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick2`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick2`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick2`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick2`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick2`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick2`.`bdcuadre` left join `bdclick2`.`primeroultimonc` on((`bdclick2`.`bdcuadre`.`Id` = `bdclick2`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick2`.`bdcuadre`.`Id`,8,100) as signed),`bdclick2`.`bdcuadre`.`Id`,`bdclick2`.`primeroultimonc`.`primeroNc`,`bdclick2`.`primeroultimonc`.`ultimoNc`,`bdclick2`.`bdcuadre`.`primeraFactura`,`bdclick2`.`bdcuadre`.`ultimaFactura`,`bdclick2`.`bdcuadre`.`primerAbono`,`bdclick2`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick2`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135
