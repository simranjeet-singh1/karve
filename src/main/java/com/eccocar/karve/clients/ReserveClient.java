package com.eccocar.karve.clients;

import com.eccocar.karve.dtos.*;

public interface ReserveClient {
    CreateReserveResponse createReserve(CreateReserveRequest createReserveRequest);

    ListReservesResponse getAllListReserves(ListReservesRequest listReservesRequest);

    ModifyReserveResponse updateReserve(ModifyReserveRequest modifyReserveRequest);

    ModifyReserveClientsByCodeResponse updateReserveClientByCode(ModifyReserveClientsByCodeRequest modifyReserveClientsByCodeRequest);

    ModifyReserveConceptsResponse updateReserveConcept(ModifyReserveConceptsRequest modifyReserveConceptsRequest);

    ModifyReserveConceptsByCodeResponse updateReserveConceptsByCode(ModifyReserveConceptsByCodeRequest modifyReserveConceptsByCodeRequest);

    ModifyReserveInformationResponse updateReserveInformation(ModifyReserveInformationRequest modifyReserveInformationRequest);

    RetrieveReserveResponse getAllReserve(RetrieveReserveRequest retrieveReserveRequest);

    RetrieveReserveByCodeResponse getAllReserveByCode(RetrieveReserveByCodeRequest retrieveReserveByCodeRequest);

    SimulateReserveResponse simulateReserve(SimulateReserveRequest simulateReserveRequest);

    ModifyReserveInformationByCodeResponse updateReserveInformationByCode(ModifyReserveInformationByCodeRequest modifyReserveInformationByCodeRequest);
}
